class CircularLinkedList {
    // creating head node whenever its object is created.
    Node1 head = null;
    Node1 last = null;
    // inserting value at the start of the LinkedList.
    void insertStart(int data) {

        Node1 newNode = new Node1(data);

        // if LinkedList is empty.
        if (head == null) 
        {
            head = newNode;
            head.next = head;
            last=head;
            return;
        }

        // if there are already some elements in the LinkedList.
        
        last.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    
    //we can use this logic also for inserting at start by inserting Node just after head node and exchanging the values.
    /*
    void insertAtStart(int data) 
    {
        Node1 newNode = new Node1(data);
        
        if(head==null)
        {
            head = newNode;
            head.next = head;
            return;
        }
        
        //inserting value just after head.
        newNode.next = head.next;
        head.next = newNode;
        
        //exchanging value of head and newNode.
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
    }
    */
    
    void insertLast(int data)
    {
        Node1 newNode = new Node1(data);

        if(head==null) 
        {
            head = newNode;
            head.next=head;
            return;
        }

        last.next = newNode;
        last = newNode;
        last.next = head;
    }
    
    //we can use this approach also for inserting values at the end
    void insertAtLast(int data)
    {
        Node1 newNode = new Node1(data);
        
        if(head == null)
        {
            head = newNode;
            head.next=head;
        }
        
        //inserting new Node just after the head node.
        newNode.next=head.next;
        head.next=newNode;
        
        //now changing values of head and new node.
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
        
        //now the making the new node the new head.
        head = newNode;
        
    }

    void deleteStart()
    {
        if(head==null)
        {
            System.out.println("LinkedList is already empty.");
            return;
        }

        //if there is only one node.
        if(head.next==head)
        {
            System.out.println(head.data+" is deleted from the LinkedList.");
            head = null ;
            return;
        }

        //if there are more than one node.
        last.next=head.next;
        head=head.next;

    }
    
    void deleteAtStart()
    {
        if(head==null)
        {
            System.out.println("LinkedList is already empty.");
            return;
        }

        //if there is only one node.
        if(head.next==head)
        {
            System.out.println(head.data+" is deleted from the LinkedList.");
            head = null ;
            return;
        }

        System.out.println(head.data+" is deleted from the linkedlist.");
        head.data=head.next.data;
        head.next = head.next.next;
    }

    //this piece of code is written considering the starting position is 1.
    void delete(int position)
    {
        if(position<1 || position>size())
        {
            System.out.println(position+"is an invalid position");
            return;
        }
        //if the List is already empty
        if(head==null)
        {
            System.out.println("The LinkedList is already empty.");
            return;
        }

        if(position==1)
        {
            deleteStart();
            return;
        }

        //if last node has to be deleted.
        if(position==size())
        {
            Node1 temp = head;
            //we will stop the temp at one position before 
            while(temp.next.next!=head)
            {
                temp=temp.next;
            }
            last = temp;
            temp.next=head;
            return;
        }

        Node1 temp = head;
        while(--position>1)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }
    void display()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty.");
            return;
        }
        Node1 temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    int size() 
    {
        //if list is empty.
        if(head==null)
        {
            return 0;
        }

        //if only 1 node is present.
        if(head.next==head)
        {
            return 1;
        }

        //if more than one node is present.
        Node1 temp = head;
        int size = 1;
        while(temp.next!=head)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
}

public class CircularLinkedList_imp1 {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertStart(30);
        cll.insertStart(20);
        cll.insertStart(10);
        cll.insertLast(40);
        cll.insertLast(50);
        cll.insertLast(60);
        cll.display();

        cll.deleteStart();
        cll.deleteAtStart();
        cll.display();
        cll.insertStart(20);
        cll.insertStart(10);
        cll.display();
        cll.delete(6);
        cll.delete(1);
        cll.delete(3);
        cll.display();
    }
}
