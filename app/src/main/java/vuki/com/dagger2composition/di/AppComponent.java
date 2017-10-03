package vuki.com.dagger2composition.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dagger2composition.App;
import vuki.com.dependency_injection.di.component.BaseAppComponent;

/**
 * Abstract class that should be extended in real project
 * Created by Vuki on 20.6.2017..
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModules.class,
        ActivityBuilder.class
})
public interface AppComponent extends BaseAppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application( Application application );

        AppComponent build();
    }

    void inject( App app );

}
