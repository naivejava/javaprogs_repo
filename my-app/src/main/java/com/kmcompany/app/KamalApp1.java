package com.kmcompany.app;

/**
 * Hello world!
 *
 */
public class KamalApp1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World From Kamal!" );
	System.out.println( "This is my first Maven Project!" );
	
	//Another outer class
	KamalApp2 km = new KamalApp2();	
	km.display();   //Call the method of the outer class

    }
}
