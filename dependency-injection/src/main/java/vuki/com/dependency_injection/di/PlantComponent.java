package vuki.com.dependency_injection.di;

import javax.inject.Singleton;

import dagger.Component;
import vuki.com.dependency_injection.shared.SharedPrefsModule;

@Singleton
@Component(modules = {
        PlantActivityBuilder.class,
        SharedPrefsModule.class
})
public interface PlantComponent {

}
