package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMemento{

    public ComandoGuardar(Mementable<Memento> calculadora, GestorMemento<Memento> gestor) {
        super(calculadora, gestor);
    }

    @Override
    public void execute() {
        this.getGestor().addMemento(IO.in.readString(), this.getCalculadora().createMemento());
    }

    @Override
    public String name() {
        return "ComandoGuardar";
    }
    
    

}
