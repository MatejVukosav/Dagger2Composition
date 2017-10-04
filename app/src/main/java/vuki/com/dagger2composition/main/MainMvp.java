package vuki.com.dagger2composition.main;

public interface MainMvp {

    interface View {
        void onMainLoaded();
    }

    interface Presenter {
        void loadMain();

        void setTime( long time );
    }

}
