package vuki.com.dependency_injection.di.component;

import android.app.Application;
import android.content.Context;

import dagger.Component;
import vuki.com.dependency_injection.di.annotations.ApplicationContext;
import vuki.com.dependency_injection.di.annotations.PerActivity;
import vuki.com.dependency_injection.di.module.AppModule;

/**
 * Created by Vuki on 20.6.2017..
 */
@PerActivity
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject( Application application );

    @ApplicationContext
    Context getContext();

    Application getApplication();

}
