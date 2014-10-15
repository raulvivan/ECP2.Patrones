package es.upm.miw.pd.command;

public abstract class ComandoMemento extends ComandoOperacion implements Comando{
    
    private GestorMemento<Memento> gestor;

    public ComandoMemento(Mementable<Memento> calculadora, GestorMemento<Memento> gestor) {
        super(calculadora);
        this.gestor =gestor; 
    }
    
    public GestorMemento<Memento> getGestor(){
        return this.gestor;
    }
    
    

}
