package com.raghavender.OOPs;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
       public void greet();
       public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            @Override
            public void greet() {
                System.out.println("Hello");
            }

            @Override
            public void greetSomeone(String someone){
                System.out.println("Hello"+someone);
            }
        }

        EnglishGreeting englishGreeting = new EnglishGreeting();

        // Anonymous local class
        HelloWorld frenchGreeting = new HelloWorld(){
            String name ="World";
            @Override
            public void greet() {
               System.out.println("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name=someone;
                System.out.println("Salut "+name);
            }
        };
        // Anonymous local class
        HelloWorld spanishGreeting = new HelloWorld(){
            String name = "World";
           public void greet(){
            System.out.println("Mundo");
           }

           public void greetSomeone(String someone){
            name = someone;
            System.out.println("Hola"+name);
           }

        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Raj");
        spanishGreeting.greet();

    }

    public static void main(String[] args){
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
