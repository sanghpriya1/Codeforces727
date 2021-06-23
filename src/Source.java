import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Source {
	public static void Order(String s)
	{
		System.out.println("String");
	}
	public static void Order(Object o)
	{
		System.out.println("Object");
	}
	public static void main (String [] args)
	{
//		Order(null);
////		List<String>  list = new ArrayList<String>(); 
////        list.add("DoSelect"); 
////        list.add("InMobi"); 
////        list.add("CampusHash"); 
////        list.add("mKhoj");
////        list.add("Microsoft");
////   
////        System.out.println("Original: " + list); 
////   
////        Collections.rotate(list, -2); 
////   
//        System.out.println("Rotated: " + list); 
//		String s1 = "xyz";
//        String s2 = s1;
//        s1 += "d";
//        System.out.println(s1 + " " + s2 + " " + (s1==s2));
//        StringBuffer sb1 = new StringBuffer("abc");
//        StringBuffer sb2 = sb1;
//        sb1.append("d");
//        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
		
//		double a = 354.03;
//        int  b = 256;
//        byte c = (byte) a;
//        byte d = (byte) b;
//        System.out.println(c + "\t"  + d);
        
//        String str="FiRstpROgrAm";;
//		String s=str;
//		int a=31,b=a++;
//		if (s=="FiRstproRAm")
//		    System.out.println(b--);
//	    else
//	        System.out.println(--b);
		int A1[] = {1, 2, 3};
        int A2[] = {1, 2, 3};
        if (A1.equals(A2))
            System.out.println("Same");
        else
            System.out.println("Not same");
		
		
	}
	

}
