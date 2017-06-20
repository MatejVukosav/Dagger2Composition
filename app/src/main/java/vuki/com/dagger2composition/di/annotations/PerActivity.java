package vuki.com.dagger2composition.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @PerActivity is a scope and is used to tell the Dagger that the Context and Activity
 * provided by the ActivityModule will be instantiated each time an Activity is created.
 * So, these objects persist till that activity lives and each activity has its own set of these.
 * Created by Vuki on 20.6.2017..
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}