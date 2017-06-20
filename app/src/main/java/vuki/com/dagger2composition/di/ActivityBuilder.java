package vuki.com.dagger2composition.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import vuki.com.dagger2composition.main.MainActivity;
import vuki.com.dagger2composition.main.MainActivityComponent;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity( MainActivityComponent.Builder builder );

}
