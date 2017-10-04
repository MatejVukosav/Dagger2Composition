package vuki.com.dependency_injection.shared;

import dagger.Module;
import dagger.Provides;


@Module
public class SharedPrefsModule {

    @Provides
    SharedPrefsInterface provideSharedPrefs( SharedPrefs sharedPrefs ) {
        return sharedPrefs;
    }

}
