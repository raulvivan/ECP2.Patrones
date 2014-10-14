package es.upm.miw.pd.command;

public abstract class ComandoOperacion implements Comando{
    
    private Calculadora calculadora;
    
    public ComandoOperacion(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    public Calculadora getCalculadora(){
        return this.calculadora;
    }

}
