package es.upm.miw.pd.text;

public class Parrafo extends Composite{

    @Override
    public void add(Componente componente) {
        if(componente.esCompuesto()){
            throw new UnsupportedOperationException();
        }else{
            this.putComponente(componente);
        }
    }
    
    @Override
    public boolean esCompuesto() {
        return true;
    }

    @Override
    public String dibujar(boolean mayus) {
        String composite = "";
        for(Componente componente: this.getComponentes()){
            composite = composite+""+componente.dibujar(mayus);
        }
        return composite+"\n";
    }

}
