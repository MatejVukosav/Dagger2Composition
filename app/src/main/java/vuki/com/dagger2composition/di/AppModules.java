package vuki.com.dagger2composition.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vuki.com.dagger2composition.di.annotations.ApplicationContext;
import vuki.com.dagger2composition.main.MainActivityComponent;

/**
 * Concrete implementation of app modules class
 * Created by Vuki on 20.6.2017..
 */
@Module(subcomponents = {
        MainActivityComponent.class
})
public class AppModules {

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext( Application application ) {
        return application;
    }

}
