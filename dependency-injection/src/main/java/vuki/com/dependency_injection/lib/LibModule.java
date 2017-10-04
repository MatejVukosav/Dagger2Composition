package vuki.com.dependency_injection.lib;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LibModule {

    @Singleton
    @Provides
    LibContract.View providesLibActivity( LibActivity libActivity ) {
        return libActivity;
    }

}
