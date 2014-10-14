package es.upm.miw.pd.command;

public abstract class ComandoOperacion implements Comando{
    
    private Calculadora2 calculadora;
    
    public ComandoOperacion(Mementable<Memento> calculadora){
        this.calculadora = (Calculadora2) calculadora;
    }
    
    public Calculadora2 getCalculadora(){
        return this.calculadora;
    }

}
