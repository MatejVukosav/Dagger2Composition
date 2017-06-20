package vuki.com.dagger2composition.main;

/**
 * Created by Vuki on 21.6.2017..
 */

public interface MainMvp {

    interface View {
        void onMainLoaded();
    }

    interface Presenter {
        void loadMain();

        void setTime( long time );
    }

}
