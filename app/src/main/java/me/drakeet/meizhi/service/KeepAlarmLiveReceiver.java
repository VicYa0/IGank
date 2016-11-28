

package me.drakeet.meizhi.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import me.drakeet.meizhi.util.AlarmManagers;

public class KeepAlarmLiveReceiver extends BroadcastReceiver {

    @Override public void onReceive(Context context, Intent intent) {
        if (intent != null && Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
            AlarmManagers.register(context);
        }
    }
}
