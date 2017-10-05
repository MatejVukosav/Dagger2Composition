package vuki.com.dagger2composition.di;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mvukosav
 */
@Module
public class AppModule {

    @Provides
    static Context provideContext( Application application ) {
        return application;
    }

}
