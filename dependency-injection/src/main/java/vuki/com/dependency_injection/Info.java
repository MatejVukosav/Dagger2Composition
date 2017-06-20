package vuki.com.dependency_injection;

/**
 * Dagger introduction
 *
 * @Module and @Provides: define classes and methods which
 * provide dependencies
 * Methods annotated with @Provides can also express dependencies
 * via method parameters
 * @Inject: request dependencies.
 * Can be used on a constructor, a field, or a method
 * With the @Inject annotation for the constructor,
 * we tell Dagger that an object of this class is injectable into other objects.
 * @Component: enable selected modules and used for performing
 * dependency injection
 * The @Component is used on an interface.
 * A @Component interface defines the connection between provider
 * of objects (modules) and the objects which expresses a dependency.
 * <p>
 * <p>
 * Dependency Injection in build upon the concept of Inversion of Control.
 * Which says that a class should get its dependencies from outside.
 * In simple words, no class should instantiate another class but
 * should get the instances from a configuration class.
 * <p>
 * If a java class creates an instance of another class via the new operator,
 * then it cannot be used and tested independently from that class
 * and is called a hard dependency.
 * <p>
 * Note: Annotation Processor is a way to read the compiled files during build time to
 * generate source code files to be used in the project.
 * <p>
 * If due to some reason we have to inject dependencies through field injection
 * for classes other that android constructed classes then
 * define a component interface for that class and
 * call it’s inject method in class’s constructor.
 *
 * I would suggest to figure out a way not to do this
 * but try to use the constructor with @Inject for the injection.
 */
@SuppressWarnings("JavaDoc")
public class Info {
}
