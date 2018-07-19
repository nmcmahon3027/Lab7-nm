package edu.luc.cs271.linkedstack;

import java.util.List;

/**
 * Generic interface for a last-in-first-out (LIFO) data structure
 * where objects are inserted into and removed from the same end.
 *
 * Based on Koffman & Wolfgang, Data Structures 3rd ed, Wiley 2015.
 *
 * @param <E> The element type
 */
public interface IStack<E>  {
  /**
   * Pushes an item onto the top of the stack and returns the item pushed.
   *
   * @param var1 The object to be inserted
   * @return The object inserted
   * @post The stack is one item larger and nonempty.
   */
  E push(E var1);

  /**
   * Returns the object at the top of the stack without removing it.
   *
   * @return The object at the top of the stack
   * @throws java.util.NoSuchElementException if stack is empty
   * @post The stack remains unchanged.
   */
  E peek();


  /**
   * Returns the object at the top of the stack and removes it.
   *
   * @return The object at the top of the stack
   * @throws java.util.NoSuchElementException if stack is empty
   * @post The stack is one item smaller.
   */
  E pop();


  /**
   * Returns true if the stack is empty; otherwise, returns false.
   *
   * @return true (false) if the stack is empty (not empty)
   * @post The stack remains unchanged.
   */
  boolean isEmpty();

  /**
   * Returns a Java list containing the items currently in the stack.
   * The item at the top of the stack is the first item of the list (at index 0).
   *
   * @return The list containing the items in the stack
   * @post The stack remains unchanged.
   * Would return LIFO List
   */
  List<E> asList();



  /**
   * Returns a Java list containing the items currently in the stack.
   * The item at the bottom of the stack is the first item of the list (at index 0).
   *
   * @post The stack remains unchanged.
   * @return The list containing the items in the stack
   */
  List<E> asFifoList(); //interface(so, no method body), FIFO List
}
