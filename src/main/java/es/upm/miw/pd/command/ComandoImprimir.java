package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoOperacion{

    public ComandoImprimir(Mementable<Memento> calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        IO.out.println("-----------");
        IO.out.println(this.getCalculadora().getTotal());
    }

    @Override
    public String name() {
        return "ComandoImprimir";
    }

}
