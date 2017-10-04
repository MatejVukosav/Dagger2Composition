package vuki.com.dependency_injection;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import vuki.com.dependency_injection.di.BaseAppComponent;

/**
 * Project application class must extend this class in order to use dependency injection.
 * Created by Vuki on 20.6.2017..
 */

public abstract class DependencyApp extends Application implements HasActivityInjector {
    protected BaseAppComponent baseAppComponent;

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

//        baseAppComponent = DaggerBaseAppComponent
//                .builder()
//                .application( this )
//                .build();
//        baseAppComponent.inject( this );

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
