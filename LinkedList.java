
class Node {
    /* A node contains two elemnts, Which are data and reference(next) of the next node */
    int data;
    Node next;
}

class LinkedList {
    /* LinkedList contains Head node for refer has starting point */
    Node head;

    public void insert(int data) {
        /* Created Object of Node class to access "data" and "next" from Node class */
        Node node = new Node();
        /* assigned input to data */
        node.data = data;

        /* if input data is first element then it is a head of the LinkedList */
        if (head == null) {
            head = node;
        }

        else {
            // To bring node to the starting point which is "head"
            Node n = head;
            // while loop will run upto last element of the LinkedList which has "next" == null;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        // for this node "next" 
        node.next = head;
        // Now this node will be the head of the LinkedList
        head = node;
    }

    public void insertAt(int data, int At) {
        Node node = new Node();
        // To bring node to the starting point which is "head"
        Node n = head;
        node.data = data;
        
        if (At == 0) {
            insertAtStart(data);
        }
        else {
            // Using for loop we are reaching at require-node(At)
            for (int i = 0; i < At - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAtStart() {
        Node n = head;
        // To delete 1st node, Head is shifed to 2nd Node
        head = n.next;
    }

    public void deleteAtEnd() {
        Node n = head;
        for (int i=0; i<size()-1; i++) {
            n = n.next;
        }
        n.next = null;
    }

    public void deleteAt(int At) {
        Node n = head;
        Node n1;
        if (At == 0) {
            deleteAtStart();
        }
        else {
            // Using for loop we are reaching at require-node(At)
            for (int i = 0; i < At - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    public int size() {
        int count = 1;
        Node n = head;
        while (n.next != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    public void searchInd(int data) {
        Node n = head;
        int ind = 0;
        Boolean bool = false; 
        while (n.next != null) {
            n = n.next;
            ind++;
            if (n.data == data) {
                bool = true;
                break;
            }
        }
        if (bool == true) {
            System.out.println(bool + " at " + ind + " index.");
        }
        else {
            System.out.println(bool + " data not found");
        }
    }

    public void show() {
        // To bring node to the starting point which is "head"
        Node n = head;
        System.out.print("(head)--> ");
        while (n.next != null) {
            System.out.print(n.data + " --> ");
            n = n.next;
        }
        System.out.println(n.data + " -->" + "(null)");
    }
}

class leetcode {
    public static void main(String [] args) {
        LinkedList list = new LinkedList();

        // Simple operations
        list.insert(15);
        list.insert(30);
        list.insert(45);
        list.insertAtStart(0);
        list.insertAt(20,2);
        list.show();
        list.deleteAt(2);
        list.show();
        list.deleteAtStart();
        list.show();
        list.deleteAtEnd();
        list.show();
        System.out.println("Size of LinkedList --> " + list.size() + " nodes.");
        System.out.println();

        // Complex operations 
        list.searchInd(30);
        list.searchInd(55);
    }
}
