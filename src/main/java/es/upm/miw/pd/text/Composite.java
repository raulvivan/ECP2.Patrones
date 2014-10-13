package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Componente{
    
    private List<Componente> componentes;
    
    public Composite(){
        componentes = new ArrayList<Componente>();
    }
    
    public List<Componente> getComponentes(){
        return this.componentes;
    }
    
    public abstract String dibujar(boolean mayus);
    
    public void putComponente(Componente componente){
        this.componentes.add(componente);
    }

}
