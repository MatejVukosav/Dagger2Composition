package vuki.com.dependency_injection.di.component;

import dagger.Component;
import vuki.com.dependency_injection.di.annotations.PerActivity;
import vuki.com.dependency_injection.di.module.ActivityModule;

/**
 * Created by Vuki on 20.6.2017..
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //void inject( Activity activity );
}
