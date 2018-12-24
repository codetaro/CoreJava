package com.journaldev.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionExample {

    // reflection for classes
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
        Constructor<?>[] publicConstructors =
                Class.forName("com.journaldev.reflection.ConcreteClass").getConstructors();
        System.out.println(Arrays.toString(publicConstructors));
    }

    private static void getAllPublicFields() throws ClassNotFoundException {
        Field[] publicFields =
                Class.forName("com.journaldev.reflection.ConcreteClass").getFields();
        System.out.println(Arrays.toString(publicFields));
    }

    private static void getAllAnnotations() throws ClassNotFoundException {
        java.lang.annotation.Annotation[] annotations =
                Class.forName("com.journaldev.reflection.ConcreteClass").getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }

    // reflection for fields
    public static void getPublicField() throws ClassNotFoundException, NoSuchFieldException {
        Field field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("interfaceInt");
        System.out.println(field);
    }

    public static void getFieldDeclaringClass() {
        try {
            Field field =
                    Class.forName("com.journaldev.reflection.ConcreteClass").getField("interfaceInt");
            Class<?> fieldClass = field.getDeclaringClass();
            System.out.println(fieldClass.getCanonicalName());
        } catch (NoSuchFieldException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getFieldType() throws ClassNotFoundException, NoSuchFieldException {
        Field field =
                Class.forName("com.journaldev.reflection.ConcreteClass").getField("publicInt");
        Class<?> fieldType = field.getType();
        System.out.println(fieldType.getCanonicalName());
    }

    public static void accessPublicFieldValue() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Field field =
                Class.forName("com.journaldev.reflection.ConcreteClass").getField("publicInt");

        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field.get(obj));
        field.setInt(obj, 10);
        System.out.println(field.get(obj));
    }

    /**
     * using reflection we can get/set the private field value by turning off
     * the java access check for field modifiers
     *
     * @throws ClassNotFoundException
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void accessPrivateFieldValue() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Field privateField =
                Class.forName("com.journaldev.reflection.ConcreteClass").getDeclaredField("privateString");

        // turning off access check with below method call
        privateField.setAccessible(true);
        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(privateField.get(objTest));

        privateField.set(objTest, "private string updated");
        System.out.println(privateField.get(objTest));
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        getClassObject();
//        getSuperClass();
//        getPublicMemberClasses();
//        getDeclaredClasses();
//        getDeclaringClass();
//        getPackageName();
//        getClassModifiers();
//        getTypeParameters();
//        getImplementedInterfaces();
//        getAllPublicMethods();
//        getAllPublicConstructors();
//        getAllPublicFields();
//        getAllAnnotations();

//        getPublicField();
//        getFieldDeclaringClass();
//        getFieldType();
//        accessPublicFieldValue();
//        accessPrivateFieldValue();
    }
}
