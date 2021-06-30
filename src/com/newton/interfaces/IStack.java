package com.newton.interfaces;

import com.newton.exceptions.EmptyException;
import com.newton.resources.Cell;

public interface IStack extends IGeneric {
    Cell removeNext() throws EmptyException;
}
