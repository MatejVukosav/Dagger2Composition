package vuki.com.dependency_injection.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import vuki.com.dependency_injection.di.annotations.ApplicationContext;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule( Application application ) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context providesContext() {
        return application.getApplicationContext();
    }

    @Provides
    Application provideApplication() {
        return application;
    }

}
