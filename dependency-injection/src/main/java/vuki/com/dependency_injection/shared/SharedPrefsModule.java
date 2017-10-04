package vuki.com.dependency_injection.shared;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class SharedPrefsModule {

    @Singleton
    @Provides
    SharedPrefsInterface provideSharedPrefs( SharedPrefs sharedPrefs ) {
        return sharedPrefs;
    }

}
