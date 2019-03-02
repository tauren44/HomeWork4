package com.mateacademy;

public interface MyList<E> {
    void add(E e);

    void remove(int index);

    void clear();

    int size();

    E get(int index);
}
