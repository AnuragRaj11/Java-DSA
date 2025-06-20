public class LL {

    // Static nested Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1️⃣ Add node at head
    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2️⃣ Add node at tail
    public void addAtTail(int data) {
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
    }

    // 3️⃣ Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != key) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // 4️⃣ Search a value
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // 5️⃣ Reverse the list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // 6️⃣ Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🔄 MAIN METHOD
    public static void main(String[] args) {
        LL list = new LL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.printList(); 

        list.addAtHead(5);
        list.printList(); 

        list.delete(20);
        list.printList(); 

        System.out.println("Search 10: " + list.search(10));  // true
        System.out.println("Search 50: " + list.search(50));  // false

        list.reverse();
        list.printList();  // 30 → 10 → 5 → null
    }
}
