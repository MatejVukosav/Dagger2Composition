package vuki.com.dependency_injection;

import android.app.Application;

/**
 * Project application class must extend this class in order to use dependency injection.
 * Created by Vuki on 20.6.2017..
 */

public abstract class DependencyApp extends Application {

//    @Inject
//    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

//        DaggerBaseAppComponent
//                .builder()
//                .application( this )
//                .build()
//                .inject( this );

    }

//    @Override
//    public AndroidInjector<Activity> activityInjector() {
//        return activityDispatchingAndroidInjector;
//    }
}
