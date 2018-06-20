package com.example.siddharthm.jsonrecyclerview;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements detail.OnItemClickListener{
    private static final String TAG = "RecyclerViewExample";
    private List<FeedItem> feedsList;
    private RecyclerView mrecyclerView;
    private MyRecyclerViewAdapter adapter;
    public static final String EXTRA_URL = "imageUrl";
    public static final String EXTRA_TITLE = "title";
    public static final String EXTRA_SUBTITLE = "subtitle";
    public static final String EXTRA_DESC = "DESC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        String url = "http://iroidtech.com/wecare/api/news_events/list?format=json";
        new DownloadTask().execute(url);

    }

    private class DownloadTask extends AsyncTask<String,Void,Integer>{


        @Override
        protected Integer doInBackground(String... params) {
            Integer result = 0;
            HttpURLConnection urlConnection;
            try {
                URL url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                int statusCode = urlConnection.getResponseCode();


                if (statusCode == 200) {
                    BufferedReader r = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = r.readLine()) != null) {
                        response.append(line);
                    }
                    parseResult(response.toString());
                    result = 1;
                } else {
                    result = 0;
                }
            } catch (Exception e) {
                Log.d(TAG, e.getLocalizedMessage());
            }
            return result;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(final Integer result) {

            if (result == 1) {
                adapter = new MyRecyclerViewAdapter(feedsList,MainActivity.this);
                mrecyclerView.setAdapter(adapter);
                adapter.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {

                        Intent detailIntent = new Intent(MainActivity.this,detail.class);
                        FeedItem clickedItem = feedsList.get(position);
                        detailIntent.putExtra(EXTRA_URL,clickedItem.getThumbnail());
                        detailIntent.putExtra(EXTRA_TITLE, clickedItem.getTitle());
                        detailIntent.putExtra(EXTRA_SUBTITLE, clickedItem.getSubtitle());
                        detailIntent.putExtra(EXTRA_DESC, clickedItem.getDescription());

                        startActivity(detailIntent);

                    }
                });

            } else {
                Toast.makeText(MainActivity.this, "Failed to fetch data!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void parseResult(String result) {
        try {
            JSONArray response = new JSONArray(result);

            feedsList = new ArrayList<>();
            for (int i = 0 ; i < response.length();i++){
                JSONObject post = response.optJSONObject(i);
                FeedItem item = new FeedItem();
                item.setTitle(post.optString("title"));
                item.setSubtitle(post.optString("subtitle"));
                String u = post.getString("image");
                item.setThumbnail("http://iroidtech.com/wecare/uploads/news_events/"+u);
                item.setDescription(post.optString("description"));
                feedsList.add(item);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

