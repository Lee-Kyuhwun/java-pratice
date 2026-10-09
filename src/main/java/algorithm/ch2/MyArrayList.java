package algorithm.ch2;

public class MyArrayList<E> {

    private int count; // 갯수

    private E[] objectList;

    public int DEFAULT_CAPACITY = 10;


    public static final int ERROR_NUM = -9999999;


    public MyArrayList(){

        objectList = (E[])new Object[DEFAULT_CAPACITY]; //

    }

}
