package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println("Merhaba Medium !");
        System.out.println("Ben Semih");
        System.out.println(new App().Add(2,3));
    }

    public int Add(int number1, int number2){
        return number1 + number2;
    }

}
