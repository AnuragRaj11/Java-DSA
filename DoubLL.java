public class DoubLL {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node head;
    // 1️⃣ Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    // 2️⃣ Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 3️⃣ Delete node by value
    public void delete(int data) {
        if (head == null) return;

        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) return; // not found

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next; // deleting head

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // 4️⃣ Print Forward
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 5️⃣ Print Backward
    public void printBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // now temp is at the tail
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubLL dll = new DoubLL();

        dll.insertAtHead(30);
        dll.insertAtHead(20);
        dll.insertAtHead(10);

        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.printForward();   

        dll.delete(30);
        dll.printForward();   

        dll.printBackward();  
    }
}
