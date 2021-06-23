
import java.util.*;
public class Outer extends Inner 
{
    public static void main(String [] args) 
    {
        Outer obj = new Inner();
        obj.cnt();
    }
}
protected class Inner
{
    void cnt() 
    {
        for (int x = 0;x<7;x++,x++ ) 
        {
            System.out.print(" " + x);
        }
    }
}
