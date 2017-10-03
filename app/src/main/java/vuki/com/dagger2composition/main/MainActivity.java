package vuki.com.dagger2composition.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Chronometer;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import vuki.com.dagger2composition.R;
import vuki.com.dagger2composition.databinding.ActivityMainBinding;
import vuki.com.dependency_injection.LibActivity;

public final class MainActivity extends AppCompatActivity implements MainMvp.View {

    @Inject
    MainMvp.Presenter presenter;

    @Inject
    LibActivity libActivity;

    ActivityMainBinding binding;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        AndroidInjection.inject( this );
        super.onCreate( savedInstanceState );
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main );

        binding.chronometer.setOnChronometerTickListener( new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick( Chronometer chronometer ) {
                presenter.setTime( chronometer.getBase() );
            }
        } );

        binding.chronometer.start();
        presenter.loadMain();
    }

    @Override
    public void onMainLoaded() {
        Toast.makeText( this, "Main is loaded", Toast.LENGTH_SHORT ).show();
    }
}
