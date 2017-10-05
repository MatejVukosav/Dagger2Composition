package vuki.com.dependency_injection.duck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;
import vuki.com.dependency_injection.R;

public class DuckActivity extends AppCompatActivity implements DuckContract.View {


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        AndroidInjection.inject( this );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lib );
    }
}
