package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoOperacion{
    
    public ComandoDeshacer(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        this.getCalculadora().deshacer();
        IO.out.clear();
        IO.out.println(this.getCalculadora().getAnteriorTotal());
    }

    @Override
    public String name() {
        return "ComandoDeshacer";
    }

}
