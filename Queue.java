
class Queue {
    int[] queue = new int[5];
    int head;
    int tail = -1;
    int count = 0;
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            tail = (tail + 1) % 5;
            queue[tail] = data;
            count++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            head++;
            count--;
        }
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull() {
        if (count == queue.length) {
            return true;
        }
        else {
            return false;
        }
    }
    public void show() {
        System.out.print("Queue: ");
        System.out.println("Head: " + head);
        System.out.println("Tail: " + tail);
        int a = head;
        int c = 0;
        while (c<count) {
            System.out.print(queue[a % 5] + " ");
            a = (a + 1) % 5;
            c++;
            }
        System.out.println();
    }
}

class A1 {
    public static void main(String [] args) {
        Queue Q = new Queue();
        System.out.println(Q.isEmpty());
        Q.enqueue(5);
        Q.enqueue(15);
        Q.enqueue(30);
        Q.show();
        Q.dequeue();
        Q.dequeue();
        Q.show();
        Q.enqueue(35);
        Q.enqueue(40);
        Q.enqueue(45);
        Q.enqueue(50);
        Q.show();
        System.out.print("Size: ");
        System.out.println(Q.size() + " units");
        System.out.println(Q.isFull());
    }
}
