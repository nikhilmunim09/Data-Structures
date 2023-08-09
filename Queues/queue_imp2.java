class Queue2 {

        int front,rear,curr_size;
        int capacity;
        int[] arr;
        
        Queue2(int capacity){
            this.capacity = capacity;
            front = curr_size = 0;
            rear = capacity-1;
            arr = new int[capacity];
        }

        boolean isFull() {
            return (curr_size==capacity);
        }

        boolean isEmpty() {
            return (curr_size==0);
        }

        void enqueue(int item){
            if(isFull()){
                System.out.println("Overflow, can't enqueue any item to the queue.");
                return;
            }

            rear = (rear+1)%capacity;
            arr[rear]=item;
            curr_size++;
            System.out.println(item+" is enqueued to the queue.");
        }

        int dequeue(){
            if(isEmpty()){
                System.out.println("Underflow, can't dequeue any item from the queue.");
                return Integer.MIN_VALUE;
            }
            int item = arr[front];
            front = (front+1)%capacity;
            curr_size--;
            System.out.println(item+" is dequeued from the queue.");
            return item;
        }

        int front(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }

        int rear() {
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return arr[rear];
        }
        
}

class queue_imp2 {
    public static void main(String[] args) {
        Queue2 queue = new Queue2(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);


        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());

    }
}