package vuki.com.network.network;

import android.text.TextUtils;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Vuki on 20.6.2017..
 */
@Singleton
final class NetworkApi {

    @Inject
    public NetworkApi() {

    }

    public boolean validateUser( String username, String password ) {
        if( TextUtils.isEmpty( username ) | TextUtils.isEmpty( password ) ) {
            return false;
        } else {
            return true;
        }
    }

}
