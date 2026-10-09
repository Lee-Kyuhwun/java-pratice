package algorithm.ch2.linkedlist;

public class ListNode<E> {
    public E data; // <E>를 사용하여 어떤 타입의 데이터든 저장할 수 있는 변수
    public ListNode<E> next; // 다음 노드를 가리키는 포인터

    public ListNode(E data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode() {
         this.data = null;
         this.next = null;
    }

    public E getData() {
        return data;
    }
}
