package vuki.com.dagger2composition.di;

import dagger.Subcomponent;
import vuki.com.dagger2composition.SharedPrefsModule;

/**
 * Created by mvukosav
 */
@Subcomponent(modules = {
        SharedPrefsModule.class
})
public interface UtilsComponent {

    @Subcomponent.Builder
    interface Builder {
//        Builder requestModule( SharedPrefsModule module );

        UtilsComponent build();
    }
}
