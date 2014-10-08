package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
    private int numero;
    
    public Numero(int numero){
        this.numero = numero;
    }

    public String toString() {
        return ""+this.numero;
    }

    public int operar() {
        return this.numero;
    }
    
    

}
