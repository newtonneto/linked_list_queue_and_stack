package com.newton.interfaces;

import com.newton.exceptions.EmptyException;
import com.newton.resources.Cell;

public interface IGeneric {
    void add(Object o);

    Cell getFirst() throws EmptyException;

    void setFirst(Cell o);

    Cell getLast() throws EmptyException;

    void setLast(Cell o);

    boolean isEmpty();

    int getSize();

    void setSize(int i);

    void print();
}
