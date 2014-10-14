package es.upm.miw.pd.command;

import upm.jbb.IO;

public class MainCalculadora {

    private GestorComandos gestor;

    private GestorMemento<Memento> gestorMementos;
    
    private Mementable<Memento> calc;

    public MainCalculadora() {
        this.gestorMementos = new GestorMemento<Memento>();
        calc = new Calculadora2();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoDeshacer(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public void createMemento() {
        this.gestorMementos.addMemento(IO.in.readString("Nombre del Memento"), calc.createMemento());
    }

    public void restoreMemento() {
        this.calc.restoreMemento(this.gestorMementos.getMemento((String) IO.in.select(gestorMementos.keys(), "Restaurar")));
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }

}
