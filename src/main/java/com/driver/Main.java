package com.driver;

public class Main {
public static void main(String args[]){
    B obj = new B();
    String result = obj.meth();
    System.out.println(result);
}
}

 class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    class B extends A {
        // Class B inherits the meth() method from class A
        public String meth() {
            return "Method is overridden in Extended class B";
        }


}
  
