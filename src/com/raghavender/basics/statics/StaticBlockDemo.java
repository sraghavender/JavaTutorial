package com.raghavender.basics.statics;
class Company{
    int id;
    String name;
    static String location;
    public Company(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Printing from the constructor...");
    }
    // static block to initialize static variables
    static {
        location = "xyz";
        System.out.println("Printing from static block...");
    }
    public void show(){
        System.out.println("id: "+id+"name: "+name+"location: "+location);
    }
}
public class StaticBlockDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        Company company1 = new Company(1,"ab");
//        company1.show();
//        Company company2 = new Company(2,"cd");
//        company2.show();
        //calling class loader which runs static block just once.
        Class.forName("com.raghavender.temp.utils.basics.statics.Company");
    }
}

