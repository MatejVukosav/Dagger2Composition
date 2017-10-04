package vuki.com.dagger2composition.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dagger2composition.main.MainActivity;
import vuki.com.dagger2composition.main.MainActivityModule;
import vuki.com.dagger2composition.LibActivity;
import vuki.com.dagger2composition.LibModule;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = LibModule.class)
    abstract LibActivity bindLibActivity();

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

}
