package vuki.com.dependency_injection.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import vuki.com.dependency_injection.shared.SharedPrefsModule;

@Component(modules = {
        AndroidInjectionModule.class,
        BaseActivityBuilder.class,
        SharedPrefsModule.class
})
public interface BaseAppComponent {

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder application( Application application );
//
//        BaseAppComponent build();
//    }
//
//    void inject( DependencyApp app );

}
