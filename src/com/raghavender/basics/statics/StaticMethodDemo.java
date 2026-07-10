package com.raghavender.basics.statics;

class Customer {
    int id;
    String name;
    static String comp = "AG";
//static content can be accessed by non-static methods.
    public void show() {
        System.out.println("Id: " + id + "name: " +name+ "Company: " + comp);
    }
// static content can not be accessed by static methods but can be referred by instance variables
    public static void showStatic(Customer customer) {
        System.out.println("Id: " + customer.id + "name: " + customer.name+ "Company: " + comp);

    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
       Customer customer =new Customer();
       customer.id =1;
       customer.name="xyz";
       customer.show();
       Customer.showStatic(customer);

    }

}
