package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;



public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  /*public Node<E> top;//created 'setter' for 'top', was private
  private int size = 0;
  private char[] stackArray;//ME*/
  private Node<E> top;

  private int size = 0;

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    return null;
  }

  @Override
  public E peek() {
    // TODO
    if (isEmpty())
    {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E newTop = top.data;
      top = top.next;
      return newTop;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // Done recursively populate the list in the desired order
    // Base Case
    if (curr == null) {
      return;
    }
    // Append the data to the end of this list.
    result.add(curr.data);
    populateList(curr.next, result);
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // Done replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {

    if (curr == null) {
      return;
    }

    result.add(0, curr.data);
    populateFifoList(curr.next, result);
  }
}