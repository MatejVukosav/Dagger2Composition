package vuki.com.dependency_injection.di.component;

import dagger.Component;
import vuki.com.dependency_injection.di.BaseActivityBuilder;
import vuki.com.dependency_injection.di.LibModule;

/**
 * Abstract class that should be extended in real project
 * Created by Vuki on 20.6.2017..
 */
@Component(modules = {
        BaseActivityBuilder.class,
        LibModule.class
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
