package com.journaldev.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException {
//        getClassObject();
//        getSuperClass();
//        getPublicMemberClasses();
//        getDeclaredClasses();
//        getDeclaringClass();
//        getPackageName();
//        getClassModifiers();
//        getTypeParameters();
//        getImplementedInterfaces();
        getAllPublicMethods();
    }

    private static void getClassObject() throws ClassNotFoundException {

        // Get Class using reflection
        Class<?> concreteClass = ConcreteClass.class;
        concreteClass = new ConcreteClass(5).getClass();

        try {
            /* below method is used most of the times in frameworks like JUnit
               Spring dependency injection, Tomcat web container
               Eclipse auto completion of method names, hibernate, Struts2 etc.
               because ConcreteClass is not available at compile time */
            concreteClass = Class.forName("com.journaldev.reflection.ConcreteClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(concreteClass.getCanonicalName());

        // for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());
        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName());
        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName());
        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());
    }

    private static void getSuperClass() throws ClassNotFoundException {
        Class<?> superClass = Class.forName("com.journaldev.reflection.ConcreteClass").getSuperclass();

        System.out.println(superClass);
        System.out.println(Object.class.getSuperclass());
        System.out.println(String[][].class.getSuperclass());
    }

    private static void getPublicMemberClasses() throws ClassNotFoundException {
        Class<?>[] classes = Class.forName("com.journaldev.reflection.ConcreteClass").getClasses();
        System.out.println(Arrays.toString(classes));
    }

    /**
     * getting all of the classes, interfaces, and enums that are explicitly
     * declared in ConcreteClass
     *
     * @throws ClassNotFoundException
     */
    private static void getDeclaredClasses() throws ClassNotFoundException {
        Class<?>[] explicitClasses =
                Class.forName("com.journaldev.reflection.ConcreteClass").getDeclaredClasses();
        System.out.println(Arrays.toString(explicitClasses));
    }

    private static void getDeclaringClass() throws ClassNotFoundException {
        Class<?> innerClass =
                Class.forName("com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultClass");
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());
    }

    private static void getPackageName() throws ClassNotFoundException {
        System.out.println(Class.forName("com.journaldev.reflection.BaseInterface").getPackage().getName());
    }

    private static void getClassModifiers() throws ClassNotFoundException {
        Class<?> concreteClass = Class.forName("com.journaldev.reflection.ConcreteClass");
        System.out.println(Modifier.toString(concreteClass.getModifiers()));

        Class<?> baseInterface = Class.forName("com.journaldev.reflection.BaseInterface");
        System.out.println(Modifier.toString(baseInterface.getModifiers()));
    }

    private static void getTypeParameters() throws ClassNotFoundException {
        TypeVariable<?>[] typeParameters =
                Class.forName("java.util.HashMap").getTypeParameters();
        for (TypeVariable<?> t : typeParameters) {
            System.out.print(t.getName() + ", ");
        }
    }

    private static void getImplementedInterfaces() throws ClassNotFoundException {
        Type[] genericInterfaces =
                Class.forName("java.util.HashMap").getGenericInterfaces();
        System.out.println(Arrays.toString(genericInterfaces));

        Type[] interfaces =
                Class.forName("java.util.HashMap").getInterfaces();
        System.out.println(Arrays.toString(interfaces));
    }

    private static void getAllPublicMethods() throws ClassNotFoundException {
        Method[] publicMethods =
                Class.forName("com.journaldev.reflection.ConcreteClass").getMethods();
        System.out.println(Arrays.toString(publicMethods));
    }

    private static void getAllPublicConstructors() throws ClassNotFoundException {
        // TODO
    }
}
