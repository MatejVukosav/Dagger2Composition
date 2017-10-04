package vuki.com.dagger2composition.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vuki.com.dependency_injection.Plant;

/**
 * Created by mvukosav
 */
@Module
public class AppModule {

    private Application application;

    public AppModule( Application application ) {
        this.application = application;
        Plant.getInstance().init( this.application );
    }

    @Provides
    @Singleton
    Context provideContext() {
        return application;
    }

}
