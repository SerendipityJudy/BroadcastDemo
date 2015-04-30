package com.demo.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(context,MainActivity.class);
		activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(activityIntent);
	}

}
