package vuki.com.dagger2composition.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dagger2composition.App;

/**
 * Created by Vuki on 20.6.2017..
 */
//@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuilder.class,
        AppModule.class
})
public interface AppComponent {

    UtilsComponent getUtils();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application( Application application );

        AppComponent build();
    }

    void inject( App app );

}
