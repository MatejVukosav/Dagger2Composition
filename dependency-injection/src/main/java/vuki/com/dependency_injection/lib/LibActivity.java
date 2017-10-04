package vuki.com.dependency_injection.lib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;
import vuki.com.dependency_injection.R;

public class LibActivity extends AppCompatActivity implements LibContract.View {


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        AndroidInjection.inject( this );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lib );
    }
}
