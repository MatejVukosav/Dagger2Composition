package vuki.com.dagger2composition;

/**
 * @Module and @Provides: define classes and methods which
 * provide dependencies
 * Methods annotated with @Provides can also express dependencies
 * via method parameters
 *
 * @Inject: request dependencies.
 * Can be used on a constructor, a field, or a method
 *
 * @Component: enable selected modules and used for performing
 * dependency injection
 * The @Component is used on an interface.
 * A @Component interface defines the connection between provider
 * of objects (modules) and the objects which expresses a dependency.
 */
@SuppressWarnings("JavaDoc")
public class Info {

}
