package vuki.com.dagger2composition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

public class LibActivity extends AppCompatActivity implements LibContract.View {


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        AndroidInjection.inject( this );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lib );
    }
}
