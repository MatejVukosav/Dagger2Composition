package vuki.com.dependency_injection.lib;

import dagger.Module;
import dagger.Provides;

@Module
public class LibModule {

    @Provides
    LibContract.View providesLibActivity( LibActivity libActivity ) {
        return libActivity;
    }


}
