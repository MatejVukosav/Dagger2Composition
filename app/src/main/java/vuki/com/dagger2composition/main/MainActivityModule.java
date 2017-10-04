package vuki.com.dagger2composition.main;

import dagger.Module;
import dagger.Provides;


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
