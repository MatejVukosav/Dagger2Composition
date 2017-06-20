package vuki.com.dagger2composition;

import android.app.Application;

import vuki.com.dependency_injection.di.component.AppComponent;

/**
 * Created by Vuki on 20.6.2017..
 */

public class App extends Application {


    protected AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
