package com.newton.interfaces;

import com.newton.exceptions.EmptyQueueException;
import com.newton.resources.QueueCell;

public interface IQueueCell {
    void setNext(QueueCell o);

    QueueCell getNext() throws EmptyQueueException;

    Object getElement();

    void setElement(Object o);

    String toString();
}
