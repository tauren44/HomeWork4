package com.mateacademy;

public interface MyStack<E> {
    void push(E item);
    void remove();
    void clear();
    int size();
    E peek();
    E pop();
}
