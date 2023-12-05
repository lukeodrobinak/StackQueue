/**
 * StackQueue.java
 * Authors: Luke O’Drobinak, Franklin Young
 * Date: 11/27/2023
 * Collaborators:
 * Citations: N/A
 **/

public class StackQueue<T> {
    private int size;   //Size of "queue"
    private Stack enqueueStack;  //Stack for enqueueing
    private Stack dequeueStack;  //Stack for dequeueing

    public StackQueue(){    //Default constructor
        enqueueStack = new Stack();
        dequeueStack = new Stack();
        size = 0;
    }

    public void enqueue(T data) {   //Enqueue data
        enqueueStack.push(data);    //Push data to enqueue stack
        size++; //Increment size
        flipFlop(dequeueStack, enqueueStack); //Flip flop data between stacks
    }

    public T dequeue() {   //Enqueue data
        if (size == 0) {    //If "queue" is empty, return null
            return null;
        }
        T tempData = (T)dequeueStack.pop();    //Push data to enqueue stack
        size--; //Decrement size
        flipFlop(enqueueStack, dequeueStack); //Flip flop data between stacks

        return tempData;   //Return dequeued data
    }

    public int getSize() {  //Return size of "queue"
        return size;
    }

    public boolean isEmpty() {  //Return true if "queue" is empty
        return size == 0;
    }

    private void flipFlop (Stack<T> flipee, Stack<T> flipper) {     //Flip flop data between two stacks
        Stack tempStack = new Stack();    //Create temporary stack
        T tempData;                     //Create temporary data variable

        while (!flipee.isEmpty()) {     //Pop all data from flippee stack
            flipee.pop();
        }

        while (!flipper.isEmpty()) {    //Push all data from flipper to flipee
            tempData = flipper.pop();
            tempStack.push(tempData);
            flipee.push(tempData);
        }

        while (!tempStack.isEmpty()) {   //Push all data from temp stack to flipper
            flipper.push((T) tempStack.pop());
        }
    }


}
