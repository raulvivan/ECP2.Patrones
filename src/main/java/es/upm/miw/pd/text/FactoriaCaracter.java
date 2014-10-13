package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<Character, Caracter> mapa = null; 
    
    private static FactoriaCaracter factory = null;
    
    public FactoriaCaracter(){
        mapa = new HashMap<>();
    }
    
    public static FactoriaCaracter getFactoria(){
        if(factory == null){
            FactoriaCaracter.factory = new FactoriaCaracter();
        }
        return FactoriaCaracter.factory;
    }
    
    public Caracter get(char key){
        if(!mapa.containsKey(key)){
             mapa.put(key, new Caracter(key));
        }   
        return mapa.get(key);
    }
    
}
