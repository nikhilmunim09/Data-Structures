class Linkedlist2 {
    Node1 head;
    //Node1 head = null; we can do this also but if we dont assign any value to head then also it will be null.
    //we can declare class Node1 here also.
    void insertStart(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int data){

        Node1 newNode = new Node1(data);
        if(head==null){
            head = newNode;
        }
        Node1 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        // newNode.next = temp.next; this will make newNode.next = null but we dont need it because its already null.
        temp.next = newNode;
    }

    void insertPosition(int data,int position){

        if(position==0){
            insertStart(data);
            return;
        }
        else if(position<0 || calcSize() < position){
            System.out.println("Can't insert, position - "+position+" is not valid.");
            return;
        }
        Node1 newNode = new Node1(data);
        Node1 temp = head;
        while(--position>0){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delete(int item) {
        Node1 temp = head;
        if(temp.data==item){
            head = temp.next;
            System.out.println(item+" is deleted from the list.");
            return;
        }
        while(temp.next!=null){
            if(temp.next.data==item){
                System.out.println(item+" is deleted from the list.");
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println(item+" is not found in the list.");
    }

    void display(){
        Node1 node = head;
        if(head==null)
        {
            System.out.println("LinkedList is empty.");
        }
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    int calcSize(){
        Node1 node = head;
        int size = 0;
        while(node!=null){
            size++;
            node = node.next;
        }
        return size;
    }
}
class Linkedlist_imp2 {
    public static void main(String[] args) {
        Linkedlist2 ll = new Linkedlist2();

        ll.insertStart(10);
        ll.insertLast(20);
        ll.delete(10);
        ll.delete(20);
        ll.display();

        ll.insertStart (12);
        ll.insertStart (16);
        ll.insertStart (20);
        
        ll.insertLast(10);
        ll.insertLast (14);
        ll.insertLast (18);
        ll.insertLast (11);
 
        ll.display();
        //Inserts after 3rd position
        ll.insertPosition (25, 3);
        ll.display();
        ll.insertPosition (30, 0);
        ll.display();
        ll.insertPosition(100, 20);
        ll.display ();
        ll.delete(14);
        ll.display();
        ll.delete(11);
        ll.display();
        ll.delete(30);
        ll.display();
    }

}
