package vuki.com.dagger2composition.main;

import javax.inject.Inject;

public class MainPresenterImpl implements MainMvp.Presenter {

    MainMvp.View view;

    long startDate;

    @Inject
    public MainPresenterImpl( MainMvp.View view ) {
        this.view = view;
    }

    @Override
    public void loadMain() {
        view.onMainLoaded();
    }

    @Override
    public void setTime( long time ) {
        this.startDate = time;
    }

}
