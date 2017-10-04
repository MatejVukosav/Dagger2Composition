package vuki.com.dependency_injection.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dependency_injection.lib.LibActivity;
import vuki.com.dependency_injection.lib.LibModule;


@Module
public abstract class BaseActivityBuilder {

    @ContributesAndroidInjector(modules = LibModule.class)
    abstract LibActivity bindLibActivity();
}
