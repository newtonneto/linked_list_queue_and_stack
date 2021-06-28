package com.newton.interfaces;

import com.newton.exceptions.EmptyStackException;
import com.newton.resources.StackCell;

public interface IStack {
    void add(Object o);

    StackCell removeNext() throws EmptyStackException;

    StackCell first() throws EmptyStackException;

    StackCell last() throws EmptyStackException;

    boolean isEmpty();

    void print();
}
