/**
 * Stack.java
 * Authors: Luke O’Drobinak
 * Date: 10/27/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/

public class Stack<T> {

    private int size;   //Size of stack
    private StackNode<T> top;   //Top node of stack

    public Stack() {}   //Default constructor

    public void push(T data) {
        if (size == 0) {    //If stack is empty, create new node
            top = new StackNode<>(data);    //Set top to new node
        }
        top = new StackNode<>(data, top);   //Else, create new node with top as child
        size++; //Increment size
    }

    public T pop() {    //Remove top node and return its data
        if (size == 0) {    //If stack is empty, return null
            return null;
        }
        size--; //Decrement size
        StackNode<T> oldTop = top;  //Store top node
        top = top.getChild();   //Set top to child node
        return oldTop.getData();    //Return data from old top node
    }

    public T peek() {   //Return data from top node
        return top.getData();
    }

    public int getSize() {  //Return size of stack
        return size;
    }

    public boolean isEmpty() {  //Return true if stack is empty
        return size == 0;
    }
}