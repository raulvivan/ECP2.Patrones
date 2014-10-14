package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoIniciar extends ComandoOperacion{

    public ComandoIniciar(Mementable<Memento> calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        this.getCalculadora().iniciar();
        IO.out.clear();
    }

    @Override
    public String name() {
        return "ComandoIniciar";
    }

}
