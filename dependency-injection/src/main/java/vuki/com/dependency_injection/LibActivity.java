package vuki.com.dependency_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.AndroidInjection;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        AndroidInjection.inject( this );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lib );
    }
}
