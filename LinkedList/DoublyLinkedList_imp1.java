class Node2 {
    int data;
    Node2 prev;
    Node2 next; 

    Node2(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}
class DoublyLinkedList {

    private Node2 head = null;

    void insertStart (int data){
        Node2 newNode = new Node2(data); 

        //if LinkedList is  empty.
        if(head==null){
            head = newNode;
            return;
        } 

        //if there are atleast one node.
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int data) {

        Node2 newNode = new Node2(data);

        //if LinkedList is empty.
        if(head==null){
            head = newNode;
            return;
        }

        //if there is atleast one node.
        Node2 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    void insertAt(int data,int position) {

        //This piece of code is written considering 0 as starting position.

        if(position==0){
            insertStart(data);
            return;
        }
        else if(position<0 || position > size()){
            System.out.println("Can't insert, position "+position+" is not valid.");
            return;
        }
        else if (position==size()){
            insertLast(data);
            return;
        }

        Node2 newNode = new Node2(data);
        Node2 temp = head;
        while(--position>0){
            temp = temp.next;
        }
        
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAfter(int data,int search){
        Node2 newNode = new Node2(data);
        Node2 temp = head;

        //temp will check for second last node in this while loop.
        while(temp.next!=null){
            if(temp.data==search){
                temp.next.prev = newNode;
                newNode.next = temp.next;
                temp.next=newNode;
                newNode.prev=temp;
                return;
            }
            temp = temp.next;
        }

        //checking for last node.
        if(temp.data==search)
        {
            insertLast(data);
            return;
        }
        System.out.println("Can't insert after value : "+search+" because "+search+" is not found in the LinkedList.");
    }

    void insertBefore(int data,int search){

        Node2 newNode = new Node2(data);
        Node2 temp = head;

        //if we have to insert before head.
        if(temp.data==search){
            insertStart(data);
            return;
        }
        temp = temp.next;

        while(temp!=null)
        {
            if(temp.data==search){
                temp.prev.next = newNode;
                newNode.prev = temp.prev;
                newNode.next = temp;
                temp.prev = newNode;
                return;
            }

            temp = temp.next;
        }

        System.out.println("Can't insert before value : "+search+" because "+search+" is not found in the LinkedList.");

    }

    int size (){
        Node2 temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    void display(){
        Node2 temp = head; 
        if(temp==null)
        {
            System.out.println("Linkedlist is empty.");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //this piece of code is written considering the starting position is 1.
    void deleteByPosition (int position) {

        if(position<1||position>size()){
            System.out.println("Can't remove any element, because position "+position+" is not valid.");
            return;
        }
        Node2 temp = head;

        //if there is only one node and it is to be deleted.
        if(head.next==null && position == 1)
        {
            head=null;
            return;
        }


        //if position is 1 then we have to delete the head.
        if(position==1) 
        {
            head = temp.next;
            head.prev = null;
            return;
        }

        //if we have to delete the last node
        if(position==size()) {

            while(temp.next!=null) 
            {
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
            return;
        }

        //if we have to delete any other node in between the linkedlist.
        while(--position>0)
        {
            temp = temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=temp.prev=null;
    }

    void deleteFirst()
    {
        //if there is only one node.
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node2 temp = head;
        System.out.println(head.data+" is deleted from the LinkedList.");
        head = temp.next;
        head.prev = null;
        temp.next=null;
        return;
    }

    void deleteLast() 
    {
        Node2 temp = head;
        //if there is only one node.
        if(temp.next==null)
        {
            head=null;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println(temp.data+" is deleted from the LinkedList.");
        temp.prev.next=null;
        temp.prev=null;
    }
    void deleteByValue(int search){

        Node2 temp = head;
        //if there is only one node and it has to be deleted.
        if(temp.next==null && temp.data == search)
        {
            head = null;
            return;
        }
        //if the head of the linkedlist has to be deleted.
        if(temp.data==search)
        {
            head = temp.next;
            head.prev = null;
            temp.next=null;
            System.out.println(search+" value deleted from LinkedList.");
            return;
        }
        temp = temp.next;
        //if in between any value has to be deleted, this loop will run till second last node
        while(temp.next!=null)
        {
            if(temp.data==search)
            {
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                temp.prev=temp.next=null;
                System.out.println(search+" value deleted from LinkedList.");
                return;
            }
            temp=temp.next;
        }

        //checking for last node.
        if(temp.data==search){
            temp.prev.next=null;
            temp.prev=temp.next=null;
            System.out.println(search+" value deleted from LinkedList.");
            return;
        }

        //if value is not found.
        System.out.println("Value : "+search+" is not found in LinkedList.");
    }

}

public class DoublyLinkedList_imp1 {
    public static void main(String[] args) {

        //creating a DoublyLinkedList object.
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertStart(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.deleteFirst();
        dll.deleteFirst();
        dll.deleteLast();
        dll.display();
        

    }
}
