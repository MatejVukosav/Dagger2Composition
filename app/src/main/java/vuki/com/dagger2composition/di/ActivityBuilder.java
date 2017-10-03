package vuki.com.dagger2composition.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vuki.com.dagger2composition.main.MainActivity;
import vuki.com.dagger2composition.main.MainActivityModule;
import vuki.com.dependency_injection.di.BaseActivityBuilder;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public abstract class ActivityBuilder extends BaseActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

}
