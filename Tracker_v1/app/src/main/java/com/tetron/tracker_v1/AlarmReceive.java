package com.tetron.tracker_v1;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class AlarmReceive  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Service_call_"  , "You are in AlarmReceive class.");

        Log.i("Test", "Service: onCreate");

        Intent background = new Intent(context, BookingTrackingService.class);
//        Intent background = new Intent(context, GoogleService.class);
        Log.e("AlarmReceive ","testing called broadcast called");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //YouService.enqueueWork(context, new Intent());
            //context.stopService(background);
            context.startForegroundService(background);

        } else {

            context.startService(background);
        }

      //  context.startService(background);
    }

}
