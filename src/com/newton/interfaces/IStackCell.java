package com.newton.interfaces;

import com.newton.exceptions.EmptyStackException;
import com.newton.resources.StackCell;

public interface IStackCell {
    void setNext(StackCell o);

    StackCell getNext() throws EmptyStackException;

    Object getElement();

    void setElement(Object o);

    String toString();
}
