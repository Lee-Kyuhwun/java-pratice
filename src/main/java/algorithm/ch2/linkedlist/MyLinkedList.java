package algorithm.ch2.linkedlist;

import algorithm.ch2.ListInterface;

public class MyLinkedList<E> implements ListInterface<E> {


    private ListNode<E> head; // 리스트의 첫 번째 노드를 가리키는 포인터
    private int count; // 리스트에 저장된 요소의 개수

    public MyLinkedList() {

        head= null;
        count=0;
    }

    @Override
    public void addElement(E data) {



    }

    @Override
    public void insertElement(int position, E data) {

    }

    @Override
    public E removeElement(int position) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E getElement(int position) {
        return null;
    }

    @Override
    public void printAll() {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
