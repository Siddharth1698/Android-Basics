package com.example.siddharthm.telephonymanagerdemo;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.textView);

        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        String IMEINumber = tm.getDeviceId();
        String SubscriberId = tm.getDeviceId();
        String SIMSerialNumber = tm.getSimSerialNumber();
        String NetworkCountryIso = tm.getNetworkCountryIso();
        String SimCountryISO = tm.getSimCountryIso();
        String SoftwaareVersion = tm.getDeviceSoftwareVersion();
        String voiceMailNumber = tm.getVoiceMailNumber();
        String strPhoneType = "";
        int PhoneType = tm.getPhoneType();
        switch (PhoneType){
            case (TelephonyManager.PHONE_TYPE_CDMA):
                 strPhoneType = "CDMA";
                 break;
            case  (TelephonyManager.PHONE_TYPE_GSM):
                strPhoneType = "GSM";
                break;
            case (TelephonyManager.PHONE_TYPE_NONE):
                strPhoneType = "None";
                break;
        }
        boolean isRoaming = tm.isNetworkRoaming();

        String info = "PHONE DETAILS \n ";
        info = info + "IMEI NUMBER " + IMEINumber + "\n";
        info = info + "SIM SERIAL NUMBER " + SIMSerialNumber + "\n";
        info = info + "SUBSCRIBER ID " + SubscriberId + "\n";
        info = info + "NETWORK COUNTRY ISO " + NetworkCountryIso + "\n";
        info = info + "SIM COUNTRY ISO " + SimCountryISO + "\n";
        info = info  + "SOFTWARE VERSION " + SoftwaareVersion + "\n";
        info = info + "VOICE MAIL NUMBER " + voiceMailNumber + "\n";
        info = info + "PHONE TYPE " + strPhoneType + "\n";
        info = info + "IS ROAMING " + isRoaming + "\n";
        t.setText(info);

    }
}
