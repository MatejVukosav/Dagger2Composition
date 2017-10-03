package vuki.com.dependency_injection.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dependency_injection.LibActivity;

/**
 * Abstract class used in dependency injection library
 * Created by Vuki on 20.6.2017..
 */
@Module
public abstract class BaseActivityBuilder {

    @ContributesAndroidInjector(modules = LibModule.class)
    abstract LibActivity bindLibActivity();
}