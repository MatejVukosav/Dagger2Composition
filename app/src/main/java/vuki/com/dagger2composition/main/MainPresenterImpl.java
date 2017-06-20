package vuki.com.dagger2composition.main;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Vuki on 20.6.2017..
 */

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
