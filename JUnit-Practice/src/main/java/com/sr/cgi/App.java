package com.sr.cgi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(addWum(10,15));;
        System.out.println(isEven(15));
    }
    public static int addWum(int a, int b){
        return a+b;
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else
            return false;
    }
}
