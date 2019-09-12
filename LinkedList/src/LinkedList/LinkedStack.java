package LinkedList;

import java.util.EmptyStackException;

public class LinkedStack<T> implements LinkedList_ADT<T>  {

    private int count;

    private LinearNode<T> top;

    /**
     * Creates an empty stack
     */
    public LinkedStack() {
        count = 0;
        top = null;
    }

    /**
     * Adds the specified element to the top of this stack
     * @param element generic element to be pushed onto stack
     */
    public void push (T element)
    {
        LinearNode<T> node = new LinearNode<T> (element);
        node.setNext(top);
        top = node;
        count++;
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it. Throws an EmptyStackException if the stack
     * is empty.
     * @return T element removed from top of stack
     * @throws java.util.EmptyStackException if a pop is attempted on empty stack
     */
    public T pop() throws EmptyStackException
    {
        if (isEmpty())
            throw new EmptyStackException();

        T element = top.getElement();
        top = top.getNext();
        count--;
        return element;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack. Throws an
     * EmptyStackException if the stack is empty.
     * @return T element on top of stack
     * @throws java.util.EmptyStackException if a peek is attempted on empty stack
     */
    public T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return top.getElement();
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in this stack.
     */
    public int size (){
        return count;
    }

    /**
     * Returns true if this stack contains no elements
     * @return boolean whether or not this stack is empty
     */
    public boolean isEmpty(){
        return count == 0;
    }

    /**
     * Returns a string representation of this stack, each element is separated by space.
     * @return String representation of this stack
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        LinearNode<T> pt = top;
        while(pt != null){
            stringBuilder.append(pt.getElement());
            if(pt.getNext() != null) stringBuilder.append(" ");
            pt = pt.getNext();
        }
        return stringBuilder.toString();
    }

}
