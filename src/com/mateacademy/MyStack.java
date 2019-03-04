package com.mateacademy;

public interface MyStack<E> {
    void add(E item);
    void remove();
    void clear();
    int size();
    E peek();
    E pop();
}
