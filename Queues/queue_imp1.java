class Queue1 {
    int front,rear;
    int capacity;
    int[] arr;

    Queue1(int capacity){
        this.capacity = capacity;
        front = rear = -1;
        arr = new int[capacity];
    }

    //Queue is empty when front size is equal to 0.
    boolean isEmpty() {
        return (front == -1);
    }

    //Queue is full when rear is equal to capacity.
    boolean isFull() {
        return (rear == capacity-1);
    }

    //Method to add an item to the queue, it changes front and rear.
    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue overflow, can't enqueue any item in the queue.");
            return;
        }

        if(isEmpty()){
            front = 0;
        }

        rear++;
        arr[rear]=item;
        System.out.println(item+" is enqueued in the queue.");
    }

    //Method to dequeue an item from the queue, it changes front and rear.
    int dequeue() {
        if(isEmpty()){
            System.out.println("Queue underflow, can't dequeue any item from the queue.");
            return Integer.MIN_VALUE;
        }

        int item = arr[front];
        front++;
        if(front>rear){
            front = rear = -1;
        }
        return item;
    }

    //Method to get front value of the queue.
    int front() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    //Method to get rear value of the queue.
    int rear() {
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return arr[rear];
    }
}

class queue_imp1 {
    public static void main(String[] args) {
        Queue1 queue = new Queue1(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }
}