package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMemento {
    
    public ComandoDeshacer(Mementable<Memento> calculadora, GestorMemento<Memento> gestor) {
        super(calculadora, gestor);
    }

    public void execute() {
        Memento memento = this.getGestor().getMemento((String) IO.in.select(this.getGestor().keys(), "Restaurar"));
        this.getCalculadora().restoreMemento(memento);
        IO.out.clear();
        IO.out.println(memento.getTotal());
    }

    public String name() {
        return "ComandoDeshacer";
    }

}
