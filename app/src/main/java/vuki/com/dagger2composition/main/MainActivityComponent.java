package vuki.com.dagger2composition.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Vuki on 20.6.2017..
 */
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
