package com.newton.resources;

import com.newton.exceptions.EmptyQueueException;
import com.newton.interfaces.IQueueCell;

public class QueueCell implements IQueueCell {
    private QueueCell next;
    private Object storaged_element;

    public QueueCell(Object element) {
        this.next = null;
        this.storaged_element = element;
    }

    @Override
    public void setNext(QueueCell o) {
        this.next = o;
    }

    @Override
    public QueueCell getNext() throws EmptyQueueException {
        return this.next;
    }

    @Override
    public Object getElement() {
        return this.storaged_element;
    }

    @Override
    public void setElement(Object o) {

    }
}
