package org.example;

public interface List<T> {
    int size();

    boolean contains(T elements);

    void add(T element);

    T[] getAll();

    T remove(T element);

    void grow();
}
