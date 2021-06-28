package com.newton.resources;

import com.newton.exceptions.EmptyStackException;
import com.newton.interfaces.IStackCell;

public class StackCell implements IStackCell {
    private StackCell next;
    private Object storaged_element;

    public StackCell(Object element) {
        this.next = null;
        this.storaged_element = element;
    }

    @Override
    public void setNext(StackCell o) {
        this.next = o;
    }

    @Override
    public StackCell getNext() throws EmptyStackException {
        return this.next;
    }

    @Override
    public Object getElement() {
        return this.storaged_element;
    }

    @Override
    public String toString() {
        return this.storaged_element.toString();
    };
}
