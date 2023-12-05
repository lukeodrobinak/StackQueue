/**
 * StackNode.java
 * Authors: Luke O’Drobinak
 * Date: 10/27/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/

public class StackNode<T> {

    //Generic type for data value
    private T data;
    //Pointer to next node
    private StackNode<T> child;

    //Default constructor
    public StackNode() {
        this.data = null;
        this.child = null;
    }

    //Constructor with data value
    public StackNode(T data) {
        this.data = data;
        this.child = null;
    }

    //Constructor with data value and child node
    public StackNode(T data, StackNode<T> child) {
        this.data = data;
        this.child = child;
    }

    //Getters and setters
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackNode<T> getChild() {
        return this.child;
    }

    public void setChild(StackNode<T> child) {
        this.child = child;
    }

    //toString method
    @Override
    public String toString() {
        return "StackNode{" +
                "data=" + data +
                ", child=" + child +
                '}';
    }



}
