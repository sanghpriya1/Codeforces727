
class MyThread extends Thread 
{
    MyThread() 
    {
        System.out.print(" Thread");
    }
    public void run() 
    {
        System.out.print(" 2");
    }
    public void run(String s) 
    {
        System.out.println(" 3");
    }
}
public class Temp 
{
    public static void main (String [] args) 
    {
//        Thread t = new MyThread() 
//        {
//            public void run() 
//            {
//                System.out.println(" 1");
//            }
//        };
//        t.start();
    	int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)result = 1;
        if (b1.equals(b2))result = result + 10;
        if (b2 == b4)result = result + 100;
        if (b2.equals(b4))result = result + 1000;
        if (b2.equals(b3))result = result + 10000;
        System.out.println(result);
    }
}