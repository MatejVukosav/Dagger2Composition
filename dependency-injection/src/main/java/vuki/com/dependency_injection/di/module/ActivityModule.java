package vuki.com.dependency_injection.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import vuki.com.dependency_injection.di.annotations.ActivityContext;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule( Activity activity ) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }
}
