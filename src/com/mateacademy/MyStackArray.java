package com.mateacademy;

public class MyStackArray<E> implements MyStack<E> {
    private final int DEFAULT_CAPACITY = 10;
    private final int CUT_RATE = 3;
    private Object[] array;
    private int top;
    private int size;


    public MyStackArray(int capacity) {
        if (capacity > DEFAULT_CAPACITY) {
            array = new Object[capacity];
        } else if (capacity >= 0) {
            array = new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
        top = -1;
    }
    public MyStackArray() {
        array = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void add(E item) {
        if (size == array.length - 1) {
            resizeArray(array.length * 2);
        }
        array[++top] = item;
        size++;
    }

    public void remove() {
        array[top--] = null;
        size--;
        if (array.length > DEFAULT_CAPACITY && size < array.length / CUT_RATE) {
            resizeArray(array.length / 2);
        }
    }

    @Override
    public void clear() {
        array = null;
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("/unchecked/")
    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return (E) array[top];
    }

    @SuppressWarnings("/unchecked/")
    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        size--;
        return (E) array[top--];
    }

    private void resizeArray(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
