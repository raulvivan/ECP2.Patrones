package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoRestar extends ComandoOperacion {

    public ComandoRestar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        IO.out.clear();
        IO.out.println(this.getCalculadora().getTotal() + "\n-\n" + valor);
        this.getCalculadora().restar(valor);
    }

    @Override
    public String name() {
        return "ComandoRestar";
    }

}
