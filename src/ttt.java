import java.io.FileOutputStream;
import java.io.IOException;

public class ttt {
	public static void foo( boolean a, boolean b)
	{ 
	    if( a ) 
	    {
	        System.out.println("A"); 
	    } 
	    else if(a && b) 
	    { 
	        System.out.println( "A && B"); 
	    } 
	    else 
	    { 
	        if ( !b ) 
	        {
	            System.out.println( "notB") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 
	}
	public static void main(String[] args)  {
//		int t;
//		System.out.println(t);
//		FileOutputStream out = null;
//        try 
//        {
//            out = new FileOutputStream("output.out");
//            out.write(125486);
//        }
//        catch(IOException io) 
//        {
//            System.out.println("Error");
//        }
//        finally 
//        {
//            out.close();
//        }
//		boolean a = false;
//		boolean b = true;
//		foo(a,b);
//		int odd = 1; 
//	    if(odd)       
//	    {
//	        System.out.println("odd"); 
//	    }
//	    else 
//	    {
//	        System.out.println("even"); 
//
//	    }
		int x = 0x80000000;
		System.out.print(x + " and ");
		x = x >>> 31;
		System.out.println(x);

	}
}
