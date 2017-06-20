package vuki.com.dependency_injection.di;

/**
 * Dependency injection annotations info
 *
 * @Qualifier annotation is provided by javax inject package and is used to qualify the dependency.
 * For example, a class can ask both, an Application Context and an Activity Context.
 * But both these Objects will be of type Context.
 * So, for Dagger2 to figure out which variable is to be provided with what,
 * we have to explicitly specify the identifier for it.
 *
 * Thus @Qualifier is used to distinguish between objects of the same type but with different instances.
 * In the above code, we have ActivityContext and ApplicationContext
 * so that the Context object being injected can refer to the respectiveContext type.
 *
 * @Named itself is annotated with @Qualifier.
 * With @Named we have to provide string identifier for similar class objects and
 * this identifier is used to map the dependency of a class.
 *
 * @Scope is used to specify the scope in which a dependency object persists.
 * If a class getting dependencies, have members injected with classes annotated with a scope,
 * then each instance of that class asking for dependencies will get its own set of member variables.
 */

public class Info {
}
