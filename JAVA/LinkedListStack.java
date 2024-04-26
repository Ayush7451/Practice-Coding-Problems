public class LinkedListStack {
    static class llnode{
        int data;
        llnode next;

        llnode(int val){
            this.data=val;
            this.next=null;
        }
    }
    static class stk{
        public llnode top;
        int size;

        public void push (int val){
            llnode nn=new llnode(val);
            if(top==null){
                top = nn;
                size++;
                return;
            }
            nn.next=top;
            top=nn;
            size++;
        }
        public int pop(){
            if(top==null){
                System.out.println("Underflow");
                return-1;
                }
                int res=top.data;
                if(top.next==null){
                    top=null;
                    size--;
                }
                else{
                    top=top.next;
                    size--;
                }
                   return res;
            }
        public boolean isEmpty(){
            return top==null;
        }
        public int stk_size(){
            return size;
        }
    }
    public static void main(String args[]){
        stk s1=new stk();
        s1.push(10);
         s1.push(20);
          s1.push(30);
           s1.push(40);
            s1.push(50);
            System.out.println(s1.pop());
            System.out.println(s1.size);
    }
}