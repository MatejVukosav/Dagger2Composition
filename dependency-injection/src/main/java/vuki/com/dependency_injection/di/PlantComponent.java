package vuki.com.dependency_injection.di;

import dagger.Component;
import vuki.com.dependency_injection.shared.SharedPrefsModule;

@Component(modules = {
        PlantActivityBuilder.class,
        SharedPrefsModule.class
})
public interface PlantComponent {

}
