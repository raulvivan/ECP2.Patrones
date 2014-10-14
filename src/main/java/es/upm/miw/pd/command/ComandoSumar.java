package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoSumar extends ComandoOperacion {

    public ComandoSumar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        IO.out.clear();
        IO.out.println(this.getCalculadora().getTotal() + "\n+\n" + valor);
        this.getCalculadora().sumar(valor);
    }

    @Override
    public String name() {
        return "ComandoSumar";
    }

}
