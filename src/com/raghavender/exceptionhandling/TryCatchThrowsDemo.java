package com.raghavender.exceptionhandling;

class A{
    public void show() throws ClassNotFoundException{
        System.out.println("Throws demo...");
        // class supplied doesn't exist hence throws "ClassNotFoundException"
        Class.forName("com.raghavender.exceptionhandling.TryCatchThrowsDemo1");
    }
}

public class TryCatchThrowsDemo {
    public static void main(String[] args) {

        A a = new A();
        // wrap the method call in try and  catch
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception..."+e);

        }
    }
}
