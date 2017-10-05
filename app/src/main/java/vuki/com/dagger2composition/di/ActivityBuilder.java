package vuki.com.dagger2composition.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dagger2composition.main.MainActivity;
import vuki.com.dagger2composition.main.MainActivityModule;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
