package com.newton.interfaces;

import com.newton.exceptions.EmptyException;
import com.newton.resources.Cell;

public interface ICell {
    void setNext(Cell o);

    Cell getNext() throws EmptyException;

    Object getElement();

    void setElement(Object o);

    String toString();
}
