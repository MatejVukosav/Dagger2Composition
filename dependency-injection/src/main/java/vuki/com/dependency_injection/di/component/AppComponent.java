package vuki.com.dependency_injection.di.component;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dependency_injection.di.ActivityBuilder;
import vuki.com.dependency_injection.di.DependencyApp;
import vuki.com.dependency_injection.di.module.AppModule;

/**
 * Abstract class that should be extended in real project
 * Created by Vuki on 20.6.2017..
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent {

    /**
     * @Component.Builder: We might want to bind some instance to Component.
     * In this case we can create an interface with @Component.Builder annotation
     * and add whatever method we want to add to builder.
     * In my case I wanted to add Application to my AppComponent.
     * Note: If you want to create a Builder for your Component,
     * your Builder interface has to has a 'build();'
     * method which returns your Component.
     */
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application( Application application );

        AppComponent build();
    }

    void inject( DependencyApp app );

}
