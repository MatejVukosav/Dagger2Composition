package vuki.com.dagger2composition.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Vuki on 20.6.2017..
 */
@Module
public class MainActivityModule {

    @Provides
    MainMvp.View provideMainView( MainActivity mainActivity ) {
        return mainActivity;
    }

    @Provides
    MainMvp.Presenter provideMainPresenter( MainMvp.View mainView ) {
        return new MainPresenterImpl( mainView );
    }

}
