package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion{
    
    public Dividir(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
        
    }

    public int operar() {
        return this.lista.get(0).operar() / this.lista.get(1).operar();
    }

    public String toString() {
        return "("+this.lista.get(0).toString()+"/"+this.lista.get(1)+")";
    }

}
