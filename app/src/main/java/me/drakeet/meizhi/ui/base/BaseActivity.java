

package me.drakeet.meizhi.ui.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import me.drakeet.meizhi.GankApi;
import me.drakeet.meizhi.DrakeetFactory;
import me.drakeet.meizhi.R;
import me.drakeet.meizhi.ui.WebActivity;
import me.drakeet.meizhi.util.Once;
import me.drakeet.meizhi.util.Toasts;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class BaseActivity extends AppCompatActivity {

    public static final GankApi sGankIO = DrakeetFactory.getGankIOSingleton();

    private CompositeSubscription mCompositeSubscription;


    public CompositeSubscription getCompositeSubscription() {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }

        return this.mCompositeSubscription;
    }


    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }

        this.mCompositeSubscription.add(s);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
    }
}
