

package me.drakeet.meizhi.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import me.drakeet.meizhi.R;
import me.drakeet.meizhi.ui.MainActivity;
import me.drakeet.meizhi.util.HeadsUps;
import me.drakeet.meizhi.util.PreferencesLoader;


public class AlarmReceiver extends BroadcastReceiver {

    @Override public void onReceive(Context context, Intent intent) {
        PreferencesLoader loader = new PreferencesLoader(context);
        if (loader.getBoolean(R.string.action_notifiable, true)) {
            HeadsUps.show(context, MainActivity.class,
                    context.getString(R.string.heads_up_title),
                    context.getString(R.string.heads_up_content),
                    R.mipmap.ic_launcher, R.mipmap.ic_female, 123123);
        }
    }
}