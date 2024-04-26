import java.util.Hashtable;
import java.util.Vector;

public class Eg1
{
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4};
        Vector<Integer> v = new Vector<Integer>();
        Hashtable<Integer, String> h = new Hashtable();
        v.addElement(1);
        v.addElement(2);
         h.put(1,"one");
        h.put(2,"two");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
        sc.close();
    }
}