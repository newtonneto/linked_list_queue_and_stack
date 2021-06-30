package com.newton.interfaces;

import com.newton.exceptions.EmptyException;
import com.newton.resources.Cell;

public interface IQueue extends IGeneric {
    Cell removeNext() throws EmptyException;
}
