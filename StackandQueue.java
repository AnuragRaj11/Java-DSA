import java.util.Queue;
import java.util.Stack;

class StackandQueue{ 
public static void main (String args[]) {
    // Create a stack
    Stack<Integer> stack = new Stack<>();
    
    // Push elements onto the stack
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    // Display the stack
    System.out.println("Stack: " + stack);
    
    // Pop an element from the stack
    int poppedElement = stack.pop();
    System.out.println("Popped Element: " + poppedElement);
    
    // Display the stack after popping
    System.out.println("Stack after pop: " + stack);
    
    // Peek at the top element of the stack
    int topElement = stack.peek();
    System.out.println("Top Element: " + topElement);
    
    // Check if the stack is empty
    boolean isEmpty = stack.isEmpty();
    System.out.println("Is Stack Empty? " + isEmpty);

    Queue <Integer> queue = new java.util.LinkedList<>();
    // Enqueue elements into the queue
    queue.add(10);
    queue.add(20);
    queue.add(30);
    // Display the queue
    System.out.println("Queue: " + queue);
    // Dequeue an element from the queue
    int dequeuedElement = queue.poll();
    System.out.println("Dequeued Element: " + dequeuedElement);
    // Display the queue after dequeueing
    System.out.println("Queue after dequeue: " + queue);
    // Peek at the front element of the queue
    int frontElement = queue.peek();
    System.out.println("Front Element: " + frontElement);
    // Check if the queue is empty
    boolean isQueueEmpty = queue.isEmpty();
    System.out.println("Is Queue Empty? " + isQueueEmpty);
    
}
} 