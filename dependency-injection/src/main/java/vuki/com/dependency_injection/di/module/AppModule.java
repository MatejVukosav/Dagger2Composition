package vuki.com.dependency_injection.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vuki.com.dependency_injection.di.annotations.ApplicationContext;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module(subcomponents = {

})
public abstract class AppModule {

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext( Application application ) {
        return application;
    }

}
