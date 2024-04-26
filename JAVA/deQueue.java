import java.util.* ;
import java.io.*; 
public class deQueue
{
    public
    int F;
    int R;
    int S;
    int ar[];

    public deQueue(int n) 
    {
        this.F=-1;
        this.R=-1;
        this.S=n;
        this.ar=new int[n];
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
         if(F==(R+1)%S) return false;
        if(F==-1){
            F=R=0;
            ar[F]=7;
            return true;
        }
        else if (F==0)
        {
            F=S-1;
            ar[F]=7;
            return true;
        }
        F--;
        ar[F]=7;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(F==(R+1)%S) return 0;
        if(F==-1){
            F=R=0;
            ar[R]=7;
            return 1;
        
        R=(R+1)%S;
        ar[R]=7;
        return 1;
        }
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
          if(F==-1) return -1;
        int res = ar[F];
        if(F==R){
        F=R=-1;
        }
        F=(F+1)%S;
        return res;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(R==-1) return -1;
        int res= ar[R];
        if (F==R){
            F=R=-1;
            return res;
        }
        else if (R==0){
            R=S-1;
            return res;
        }
        R--;
        return res;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(F==-1) return -1;
        return ar[F];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
         if(R==-1) return -1;
        return ar[R];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
         return R==-1;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
         return R==-1;
    }
}
