package com.journaldev.cl;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CCLoader extends ClassLoader {

    /**
     * This is the constructor which is responsible for setting the parent ClassLoader
     *
     * @param parent
     */
    public CCLoader(ClassLoader parent) {
        super(parent);
    }

    /**
     * This method will call the loadClassFileData() function and by invoking the parent
     * defineClass() method, it will generate the Class and return it.
     *
     * @param name Fully classified name of class, for example com.journaldev.cl.Foo
     * @return
     */
    private Class<?> getClass(String name) throws ClassNotFoundException {
        String file = name.replace('.', File.separatorChar) + ".class";
        byte[] b = null;
        try {
            b = loadClassFileData(file);
            // defineClass is inherited from the ClassLoader class
            // that converts byte array into a Class. defineClass is final
            // so we cannot override it
            Class c = defineClass(name, b, 0, b.length);
            resolveClass(c);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * This method is responsible for loading the Class. If the class name starts with
     * com.journaldev then it will load it using getClass() method or else it
     * will invoke the parent loadClass function to load it.
     *
     * @param name
     * @return
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loading Class '" + name + "'");
        if (name.startsWith("com.journaldev")) {
            System.out.println("Loading Class using CCLoader");
            return getClass(name);
        }
        return super.loadClass(name);
    }

    /**
     * This method will read the class file from file system to byte array.
     *
     * @param name
     * @return Byte array read from the file
     * @throws IOException
     */
    private byte[] loadClassFileData(String name) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
        int size = stream.available();
        byte buff[] = new byte[size];
        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();
        return buff;
    }
}
