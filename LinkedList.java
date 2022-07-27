
class Node {
    int data;
    Node next;
}

class LinkedList {
    Node Head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (Head == null) {
            Head = node;
        }
        else {
            Node n = Head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = Head;

        while (node.next != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println(node.data);
    }
}

class leetcode {
    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.show();
    }
}
