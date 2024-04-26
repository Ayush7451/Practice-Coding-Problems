import java.util.Scanner;

public class linearSearch {
    int a[]=new int[10],key;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the Number : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
        key = sc.nextInt();
    }
    void Search()
    {
        int flag=0,pos;
        for(int i=0; i<10 && flag == 0 ; i++)
        {
            if(a[i]==key)
            {
                flag = 1;
                pos = i+1;
            }
        }
        if(flag==1) System.out.println("Number Found "+pos);
        else System.out.println("Number not Found");
    }
}
class demo{
    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        ls=getdata();
        ls=Search();

    }
}
