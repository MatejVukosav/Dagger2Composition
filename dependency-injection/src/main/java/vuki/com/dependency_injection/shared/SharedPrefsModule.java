package vuki.com.dependency_injection.shared;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefsModule {

    @Provides
    static SharedPrefsInterface provideSharedPrefs() {
        return new SharedPrefs();
    }
}
