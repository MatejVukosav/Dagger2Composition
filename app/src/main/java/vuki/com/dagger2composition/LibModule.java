package vuki.com.dagger2composition;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mvukosav
 */
@Module
public class LibModule {

    //    @PerActivity
    @Provides
    LibContract.View providesLibActivity( LibActivity libActivity ) {
        return libActivity;
    }


}
