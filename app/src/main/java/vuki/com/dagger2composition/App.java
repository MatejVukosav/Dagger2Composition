package vuki.com.dagger2composition;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import vuki.com.dagger2composition.di.DaggerAppComponent;

/**
 * Created by Vuki on 20.6.2017..
 */

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent
                .builder()
                .application( this )
                .build()
                .inject( this );
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

}
