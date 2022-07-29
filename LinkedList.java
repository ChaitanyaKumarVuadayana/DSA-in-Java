
class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int data, int At) {
        Node node = new Node();
        node.data = data;

        if (At == 0) {
            insertAtStart(data);
        }
        else {
            Node n = head;

            for (int i=0; i<At; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int At) {
        if (At == 0) {
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;

            for (int i=0; i<At-1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " --> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

class A1 {
    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(8);
        list.insertAtStart(0);
        list.insertAt(6,2);
        list.deleteAt(3);
        list.show();
    }
}
