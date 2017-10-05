package vuki.com.dependency_injection.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dependency_injection.duck.DuckActivity;
import vuki.com.dependency_injection.duck.DuckModule;


@Module
public abstract class PlantActivityBuilder {

    @ContributesAndroidInjector(modules = DuckModule.class)
    abstract DuckActivity bindLibActivity();
}
