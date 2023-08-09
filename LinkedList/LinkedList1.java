class Node1 {
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        next = null;
    }
}

class LinkedList1 {

    static Node1 insertStart(int data,Node1 head) {

        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node1 insertLast(int data,Node1 head){

        Node1 newNode = new Node1(data);
        if(head==null){
            head = newNode;
            return head;
        }
        Node1 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        // newNode.next = temp.next; this will make newNode.next = null but we dont need it because its already null.
        temp.next = newNode;
        return head;
    }

    static Node1 insertPosition(int data,int position,Node1 head){

        if(position==0){
            insertStart(data, head);
        }
        else if(position<0 || calcSize(head) < position){
            System.out.println("Can't insert, "+position+" is not valid.");
            return head;
        }
        Node1 newNode = new Node1(data);
        Node1 temp = head;
        while(--position>0){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static void display(Node1 node){
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    static int calcSize(Node1 node){
        int size = 0;
        while(node!=null){
            size++;
            node = node.next;
        }
        return size;
    }

    public static void main (String args[]) 
    {
    
        Node1 head = null;
 
        head = insertStart (12, head);
        head = insertStart (16, head);
        head = insertStart (20, head);
     
        insertLast (10, head);
        insertLast (14, head);
        insertLast (18, head);
        insertLast (11, head);
 
        display(head);
        //Inserts after 3rd position
        insertPosition (25, 3, head);
        display(head);
        insertPosition (30, 0, head);
        display(head);
        insertPosition(100, 20, head);

        display (head);
 
    } 
}

