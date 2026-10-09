package algorithm.ch2;

public interface ListInterface<E> {

    void addElement(E data);

    void insertElement(int position, E data);

    E removeElement(int position);

    int getSize();

    boolean isEmpty();

    E getElement(int position);

    void printAll();

    void removeAll();

    int getCapacity();
}
