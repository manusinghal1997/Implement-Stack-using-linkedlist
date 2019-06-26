/**
 *
 * @author Manu Singhal
 */

 class Stackusinglinkedlist {
    Node root;
    static class Node{
        int data;
        Node next;
        Node(){
            this.data = 0;
        }
        Node(int d){
            this.data = d;
        }
    }
     public boolean isEmpty(){
            if(root==null)
            return true;
            else
            return false;
     }
     
       public boolean push(int d){
           Node n = new Node(d);
           
           
        if(root==null){
            root=n;
            return true;
        }
        else
        {
            Node temp = new Node();
            temp = root;
            root = n;
            root.next = temp;
        return true;
        }
    }
       public int pop(){
           if(root==null){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               int data = root.data;
               root = root.next;
               return data;     
           }
       }
       public void showall(){
           Node n = new Node();
           n =root;
           if(root == null)
               System.out.println("Stack Underflow");
           while(n!=null){
               System.out.println(n.data);
               n = n.next;
           }
       }
    public static void main(String[] args) {
        Stackusinglinkedlist s = new Stackusinglinkedlist();
        s.push(12);
        s.push(13);
        s.push(14);
       System.out.println("Popped Item  = "+s.pop());
        s.showall();        
    }    
}