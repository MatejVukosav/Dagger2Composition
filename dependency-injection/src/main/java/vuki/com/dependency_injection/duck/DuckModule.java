package vuki.com.dependency_injection.duck;

import dagger.Module;
import dagger.Provides;

@Module
public class DuckModule {

    @Provides
    DuckActivity provideActivity() {
        return new DuckActivity();
    }

    @Provides
    DuckContract.View providesLibActivity( DuckActivity duckActivity ) {
        return duckActivity;
    }

}
