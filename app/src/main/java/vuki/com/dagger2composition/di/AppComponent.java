package vuki.com.dagger2composition.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dagger2composition.App;

/**
 * Abstract class that should be extended in real project
 * Created by Vuki on 20.6.2017..
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModules.class,
        ActivityBuilder.class
})
public interface AppComponent {

    /**
     * @Component.Builder: We might want to bind some instance to Component.
     * In this case we can create an interface with @Component.Builder annotation
     * and add whatever method we want to add to builder.
     * In my case I wanted to add Application to my ProjectComponent.
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

    void inject( App app );

}
