class stack{
    int top;
    int []ar;
    int size;
    stack(int size){
        this.top=-1;
        this.size=size;
        this.ar=new int[size];
    }
    void push(stack s1,int val){
        if(s1.top==s1.size-1){
            System.out.println("Overflow");
            return;
        }
        s1.top++;
        s1.ar[s1.top]=val;
    }
    int pop(stack s1){
        if(s1.top==-1){
            System.out.println("underflow");
            return -1;
        }
        int res=s1.ar[s1.top];
        s1.top--;
        return res;
    }
    public boolean isEmpty (stack s1){
        return s1.top==-1;
    }
    public boolean isFull (stack s1){
        return s1.top==s1.size-1;
    }
    int peak(stack s1){
        if(s1.top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return s1.ar[s1.top];
    }
}
public class Queue_Stack{
    public static void main(String args[]){
        stack s2 = new stack(10);
        for(int i=1;i<=10;i++) s2.push(s2,i*2);
        System.out.println("Toppest element is "+ s2.peak(s2));
        System.out.println();
    }
}
