package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  /*public Node<E> top;//created 'setter' for 'top', was private
  private int size = 0;
  private char[] stackArray;//ME*/
  public Node<E> top;
  private int size = 0;
  private char[] stackArray;


  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    ++this.size;
    return null;
  }

  @Override
  public E peek() {
    // TODO

    return null;
  }

  @Override
  public E pop() {
    --this.size;
    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  /*@Override
  public List<E> asList() {*/
  // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
  // TODO add any instance variable(s) required to support this
  @Override
  public List<E> asList() {
   /* final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // TODO replace null with the right reference
    //ME below
    String[] arr1 = {"a", "b", "c",};
    System.out.print(arr1[1]);
    //SENDING populateList method null and result AS OF NOW
    //1.Its expecting a Node, from Node it will CALL current
    //2. and a result
    //null==>>should be==> Node (the only one?)-same for asfifoList
    //null==>what Node you want to start populating the list w/
    //only one Node you can access w/ stack (FIRST?)
    return result;
  }*/
    ArrayList<E> result = new ArrayList(this.size);
    this.populateList(this.top, result);
    String[] arr1 = new String[]{"a", "b", "c"};
    System.out.print(arr1[1]);
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {//start @ TOP of Stack
    //ME Below
    /*if (curr != null) {//if current Node(top of stack), add it to my result(end)b/c 'add' in ArrayList adds @ end(LIFO)
      result.add((E) curr);//adding to END of ArrayList, make sure add to ArrayList(0) (sub (or of) zero)
      //2nd Node added to ArrayList of/sub (1)
    }*/
    // TODO recursively populate the list in the desired order
    if (curr != null) {
      result.add((E) curr);
    }
  }

  @Override
  public List<E> asFifoList() {
    /*final ArrayList<E> result = new ArrayList<>(size);
    //adding to this array list, SENDING THIS ArrayList to populateList & populateFifoList
    //START @ TOP of Stack(usually do)
    Scanner input = new Scanner(System.in);


    populateFifoList(top, result); // TODO replace null with the right reference
    return result;
*/
    ArrayList<E> result = new ArrayList(this.size);
    new Scanner(System.in);
    this.populateFifoList(this.top, result);
    return result;
  }


  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    //can specify where in ArrayList I want to insert that data
    //for 1st time, curr == to top of stack(most recent Node) ArrayList(0)
    //USE add METHOD for array list//ME BELOW
   /* ArrayList populateFifoList = new ArrayList();

    if (curr != null)
      populateFifoList.add(curr);
    else {
      populateFifoList(curr.next, result);
      top.equals(curr);


    }*/
    ArrayList populateFifoList = new ArrayList();
    if (curr != null) {
      populateFifoList.add(curr);
    } else {
      this.populateFifoList(curr.next, result);
      this.top.equals(curr);
    }
  }

  public void setTop(Node<E> data) {
    if (this.top.next == null) {
      this.top.next = new Node(data);
    } else {
      this.setTop(this.top.next);
    }

    this.top = this.top;
  }
}

  //if current Node ==null
//if not, take data from that node (curr node) and add it to a list

