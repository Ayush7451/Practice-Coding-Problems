import java.util.Scanner;
class BinarySearch{
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
        int i, j, mid,flag,pos;
        i=0; j=9; flag=0;
        while (i<=j && flag==0)
        {
            mid = (i+j)/2;
            if(a[mid]==key)
            {
                flag=1; pos=mid+1;
            }
            if(a[mid]>key) j=mid-1;
            if(a[mid]<key) i=mid+1;
        }
        if(flag==0) System.out.print("Not found");
        else System.out.print("Found");
    }
}
class demo
{
    public static void main(String [] args)
    {
        BinarySearch bs = new BinarySearch();
        bs.getdata();
        bs.Search();
    }
}