public class LinkedList_PQ4 {
    public static void main(String[] args) {

        Linkedlist2 list1 = new Linkedlist2();
        Linkedlist2 list2 = new Linkedlist2();

        list1.insertStart(19);
        list1.insertStart(11);
        list1.insertStart(5);
        list1.insertStart(1);

        list2.insertStart(30);
        list2.insertStart(25);
        list2.insertStart(20);
        list2.insertStart(11);
        list2.insertStart(3);
        list2.insertStart(1);

        list1.display();
        list2.display();

        Linkedlist2 newlist = merge(list1, list2);
        newlist.display();
    }

    public static Linkedlist2 merge(Linkedlist2 list1,Linkedlist2 list2)
    {
        Node1 temp1 = list1.head;
        Node1 temp2 = list2.head;
        Node1 newTemp , next;
        Linkedlist2 newList = new Linkedlist2();

        //checking for the head node of the newList
        if(temp2.data<temp1.data)
        {
            next = temp2.next;
            newList.head = temp2;
            temp2 = next;
            newTemp = newList.head;
        }
        else
        {
            next = temp1.next;
            newList.head = temp1;
            temp1 = next;
            newTemp = newList.head;
        }

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                next = temp1.next;
                newTemp.next=temp1;
                temp1 = next;
                newTemp=newTemp.next;
            }
            else
            {
                next = temp2.next;
                newTemp.next=temp2;
                temp2 = next;
                newTemp = newTemp.next;
            }

        }

        if(temp1!=null)
        {
            while(temp1!=null)
            {
                next = temp1.next;
                newTemp.next=temp1;
                temp1 = next;
                newTemp=newTemp.next;
            }
        }
    

        if(temp2!=null)
        {
            while(temp2!=null)
            {
                next = temp2.next;
                newTemp.next=temp2;
                temp2=next;
                newTemp=newTemp.next;
            }
        }
        return newList;
    }

}
