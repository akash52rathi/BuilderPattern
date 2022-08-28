package com.example.demo.NestedClass;

public class MainToTestNestedClass {
    public static void main(String[] args) {
        NestedStatic.StaticInner obj1=new NestedStatic.StaticInner();
        obj1.display();
        NestedStatic obj2=new NestedStatic();
        NestedStatic.NestedClass obj3 = obj2.new NestedClass();
        obj3.display();

        Age obj4 = new Age() {
            @Override
            public void getAge() {
                System.out.println("age -> "  +x );
            }
        };

        obj4.getAge();
    }
}
