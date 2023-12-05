/**
 * Main.java
 * Authors: Luke O’Drobinak, Franklin Young
 * Date: 11/27/2023
 * Collaborators:
 * Citations: N/A
 **/
public class Main {
    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<>(); //Create new StackQueue
        stackQueue.enqueue(1);  //Enqueue 1
        stackQueue.enqueue(2);  //Enqueue 2
        stackQueue.enqueue(3);  //Enqueue 3
        stackQueue.enqueue(4);  //Enqueue 4
        stackQueue.enqueue(5);  //Enqueue 5
        System.out.println(stackQueue.dequeue()); //Dequeue 1
        System.out.println(stackQueue.dequeue()); //Dequeue 2
        System.out.println(stackQueue.dequeue()); //Dequeue 3
        System.out.println(stackQueue.dequeue()); //Dequeue 4
        System.out.println(stackQueue.dequeue()); //Dequeue 5
        System.out.println(stackQueue.dequeue()); //Dequeue null

    }
}
