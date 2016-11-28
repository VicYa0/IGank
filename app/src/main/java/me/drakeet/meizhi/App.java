

package me.drakeet.meizhi;

import android.app.Application;
import android.content.Context;
import com.litesuits.orm.LiteOrm;
import me.drakeet.meizhi.util.Toasts;

public class App extends Application {

    private static final String DB_NAME = "gank.db";
    public static Context sContext;
    public static LiteOrm sDb;


    @Override public void onCreate() {
        super.onCreate();
        sContext = this;
        Toasts.register(this);
        sDb = LiteOrm.newSingleInstance(this, DB_NAME);
        if (BuildConfig.DEBUG) {
            sDb.setDebugged(true);
        }
    }


    @Override public void onTerminate() {
        super.onTerminate();
    }
}
