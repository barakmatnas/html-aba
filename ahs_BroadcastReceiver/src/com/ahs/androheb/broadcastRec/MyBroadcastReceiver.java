package com.ahs.androheb.broadcastRec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver{
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().matches("android.intent.action.BOOT_COMPLETED")){
			Log.i(getClass().getSimpleName(),"Action Boot");
		}
		else if (intent.getAction().matches("android.intent.action.TIME_TICK")){
			Log.i(getClass().getSimpleName(),"tick");
		}
		else if (intent.getAction().matches("android.intent.action.TIME_SET")){
			Log.i(getClass().getSimpleName(),"TIME_SET");
		}
		else if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
			Log.i(getClass().getSimpleName(),"SMS_RECEIVED");
		}
		else 
		{
			Log.i(getClass().getSimpleName(), "else ");
		}
	}

}

