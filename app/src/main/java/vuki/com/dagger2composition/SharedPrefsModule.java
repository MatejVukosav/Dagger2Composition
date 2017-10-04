package vuki.com.dagger2composition;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mvukosav
 */
@Module
public class SharedPrefsModule {

    @Provides
    SharedPrefsInterface provideSharedPrefs( SharedPrefs sharedPrefs ) {
        return sharedPrefs;
    }

}
