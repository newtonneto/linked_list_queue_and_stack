package com.newton.resources;

import com.newton.exceptions.EmptyException;
import com.newton.interfaces.IQueue;

public class Queue extends Generic implements IQueue {
    public Queue() {
        super();
    }

    @Override
    public Cell removeNext() throws EmptyException {
        if (this.isEmpty()) {
            throw new EmptyException("removeNext(): Fila vazia");
        }

        //Salva a referencia do primeiro nó, o que será apagado
        Cell removed_cell = super.getFirst();
        //Atualiza o tamanho da fila
        super.setSize(super.getSize() - 1);

        //Se o tamanho da fila voltar a ser 0, a referencia ao primeiro e ultimo nó tem que ser null
        if (super.getSize() == 0) {
            super.setFirst(null);
            super.setLast(null);
        } else {
            //Recebe a referencia do novo primeiro nó
            Cell wanted_cell = removed_cell.getNext();
            //Define o nove primeiro nó
            super.setFirst(wanted_cell);
            //Remove a referencia do nó seguindo do nó apagado
            removed_cell.setNext(null);
        }

        return removed_cell;
    }
}
