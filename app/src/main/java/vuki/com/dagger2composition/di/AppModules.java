package vuki.com.dagger2composition.di;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Concrete implementation of app modules class
 * Created by Vuki on 20.6.2017..
 */
@Module
public class AppModules {

    @Provides
    Context provideContext( Application application ) {
        return application;
    }

}
