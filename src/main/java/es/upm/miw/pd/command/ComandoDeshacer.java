package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoOperacion{
    
    public ComandoDeshacer(Mementable<Memento> calculadora) {
        super(calculadora);
    }

    public void execute() {
        this.getCalculadora().deshacer();
        IO.out.clear();
        IO.out.println(this.getCalculadora().getAnteriorTotal());
    }

    public String name() {
        return "ComandoDeshacer";
    }

}
