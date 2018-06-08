package com.example.siddharthm.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

class MyService extends Service {
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(getApplicationContext(),"Service started",Toast.LENGTH_SHORT).show();
        mp = MediaPlayer.create(this,R.raw.old);
        mp.setLooping(false);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(getApplicationContext(),"Service started",Toast.LENGTH_SHORT).show();
        mp.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(),"Service stopped",Toast.LENGTH_SHORT).show();
        mp.stop();
    }
}
