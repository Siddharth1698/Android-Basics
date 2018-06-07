package com.example.siddharthm.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

class MyBroadCastServices extends BroadcastReceiver {

    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context,R.raw.old);
        mp.start();
        Toast.makeText(context, "Its Time", Toast.LENGTH_SHORT).show();


    }
}
