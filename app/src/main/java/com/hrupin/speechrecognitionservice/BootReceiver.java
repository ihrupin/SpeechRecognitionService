package com.hrupin.speechrecognitionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Igor Khrupin www.hrupin.com on 6/3/16.
 */
public class BootReceiver extends BroadcastReceiver {
    private static final String LOG_TAG = BootReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(LOG_TAG, "onReceive");
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Log.i(LOG_TAG, "onReceive onBoot");
            context.startService(new Intent(context, VoiceService.class));
        }
    }
}
