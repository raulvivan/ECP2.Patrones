package es.upm.miw.pd.command;

public class Calculadora2 extends Calculadora implements Mementable<Memento>{

    @Override
    public Memento createMemento() {
        return new Memento(this.getTotal());
    }

    @Override
    public void restoreMemento(Memento memento) {
        this.setTotal(memento.getTotal());
    }

}
