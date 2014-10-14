package es.upm.miw.pd.command;

public interface Mementable<T> {
    
    public Memento createMemento();
    
    public void restoreMemento(T memento);

}
