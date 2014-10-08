package es.upm.miw.pd.composite.expression.solution;

public class Dividir extends Operacion{
    
    public Dividir(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
        
    }

    public int operar() {
        return this.expresion1.operar() / this.expresion2.operar();
    }

    public String toString() {
        return "("+this.expresion1.toString()+"/"+this.expresion2.toString()+")";
    }

}
