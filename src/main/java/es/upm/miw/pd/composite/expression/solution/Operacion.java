package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacion extends Expresion {
    
    protected List<Expresion> lista;
    
    public Operacion(Expresion expresion1, Expresion expresion2){
        lista = new ArrayList<Expresion>();
        lista.add(expresion1);
        lista.add(expresion2);
    }
    
    public abstract int operar();

    public abstract String toString();

}
