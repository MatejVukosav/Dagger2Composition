package vuki.com.dagger2composition.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dagger2composition.App;
import vuki.com.dependency_injection.duck.DuckModule;
import vuki.com.dependency_injection.shared.SharedPrefsModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class,
        SharedPrefsModule.class,
        DuckModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application( Application application );

        AppComponent build();
    }

    void inject( App app );

}
