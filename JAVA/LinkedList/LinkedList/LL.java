package LinkedList;
public class LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void add(int data){
            Node temp = head;
            if (head == null){
                head = temp;
                tail = temp;
                temp.next = head;
            }
            else{
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public static void main (String args []){
            LinkedList ll = new LinkedList();
            ll.add(1);
            ll.add(2);
            ll.add(3);
            ll.add(4);
            ll.display();
        }
    }
    
}
