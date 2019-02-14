package com.journaldev.cl;

import java.lang.reflect.Method;

public class CCRun {

    public static void main(String[] args) throws Exception {
        String progClass = args[0];
        String[] progArgs = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        CCLoader ccl = new CCLoader(CCRun.class.getClassLoader());
        Class cls = ccl.loadClass(progClass);
        Class[] mainArgType = {(new String[0]).getClass()};
        Method main = cls.getMethod("main", mainArgType);
        Object[] argsArray = {progArgs};
        main.invoke(null, argsArray);

        Method printCL = cls.getMethod("printCL", null);
        // If the number of formal parameters required by the underlying method is 0,
        // the supplied args array may be of length 0 or null.
        printCL.invoke(null, new Object[0]);
    }
}
