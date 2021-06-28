package com.newton.interfaces;

import com.newton.exceptions.EmptyQueueException;
import com.newton.resources.QueueCell;


public interface IQueue {
    void add(Object o);

    QueueCell removeNext() throws EmptyQueueException;

    QueueCell first() throws EmptyQueueException;

    QueueCell last() throws EmptyQueueException;

    boolean isEmpty();

    int size();

    void print();
}
