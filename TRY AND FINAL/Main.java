package com.company;

public class Main {

    public static void main(String[] args) {

            System.out.println(print());

    }
    public static String print()
    {
        try
        {
            throw new NullPointerException();

        }
        finally
        {
            System.out.println("Executing finally block");
        }
    }

}
/*
final works whether exception occurs or not (of course after try block and in absense of catch block)
1. try and final
    /////////
        try {
                System.out.println("Executing try block");
            } finally {
                System.out.println("Executing finally block");
            }
            ////////////
            OUTPUT:
            Executing try block
            Executing finally block

 2. try and final
    ///////////
     String name=null;
        try {
                System.out.println(name.length());
                System.out.println("Executing try block");
            } finally {
                System.out.println("Executing finally block");
            }
            ////////////
            OUTPUT:
            Executing finally block
            Exception in thread "main"

    3. try, final and return from try
    /////////
     public static void main(String[] args) {

            System.out.println(print());

    }
    public static String print()
    {
        try
        {
            System.out.println("Executing try block");
            return "Return from try block";
        }
        finally
        {
            System.out.println("Executing finally block");
        }
    }
    /////////////
    OUTPUT:
    Executing try block
    Executing finally block
    Return from try block


    4. try, final and return from final: return from try is overriden by return from final block
     /////////
     public static void main(String[] args) {

            System.out.println(print());

    }
    public static String print()
    {
        try
        {
            System.out.println("Executing try block");
            return "Return from try block";
        }
        finally
        {
            System.out.println("Executing finally block");
             return "Return from final block";
        }
    }
    /////////
    OUTPUT:
    Executing try block
    Executing finally block
    Return from final block

    5.if exception is thrown in try block
    /////
    public static void main(String[] args) {

            System.out.println(print());

    }
    public static String print()
    {
        try
        {
            throw new NullPointerException();

        }
        finally
        {
            System.out.println("Executing finally block");
        }
    }
    ///////////
    OUTPUT:
    Executing finally block
    Exception in thread "main" java.lang.NullPointerException

 */
