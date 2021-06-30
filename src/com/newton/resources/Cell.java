package com.newton.resources;

import com.newton.exceptions.EmptyException;
import com.newton.interfaces.ICell;

public class Cell implements ICell {
    private Cell next;
    private Object storaged_element;

    public Cell(Object element) {
        this.next = null;
        this.storaged_element = element;
    }

    @Override
    public void setNext(Cell o) {
        this.next = o;
    }

    @Override
    public Cell getNext() throws EmptyException {
        return this.next;
    }

    @Override
    public Object getElement() {
        return this.storaged_element;
    }

    @Override
    public void setElement(Object o) {
        this.storaged_element = o;
    }

    public String toString() {
        return this.storaged_element.toString();
    };
}
