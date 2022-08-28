package com.example.demo.NestedClass;

public class NestedStatic {

    static int outer_x=10;
    int outer_y=20;
    private static int outer_private =30;

    static class StaticInner{

        void display()
        {
            System.out.println("outer_x -> "+ outer_x );
           //compilation error
            // System.out.println("outer_y -> "+ outer_y);
            System.out.println("outer_private -> "+ outer_private);
        }
    }

    class NestedClass{
        void display()
        {
            System.out.println("outer_y -> "+ outer_y);
            System.out.println("outer_private -> "+ outer_private);
        }
    }


}
