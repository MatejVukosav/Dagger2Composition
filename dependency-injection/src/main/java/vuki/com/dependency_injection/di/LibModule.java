package vuki.com.dependency_injection.di;

import dagger.Module;
import dagger.Provides;
import vuki.com.dependency_injection.LibActivity;

/**
 * Created by mvukosav
 */
@Module
public class LibModule {

    @Provides
    LibActivity providesLibActivity( LibActivity libActivity ) {
        return libActivity;
    }
}
