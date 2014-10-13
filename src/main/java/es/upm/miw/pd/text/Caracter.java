package es.upm.miw.pd.text;

public class Caracter extends Componente {

    private char caracter;

    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    public String dibujar(boolean mayus) {
        if (!mayus) {
            return "" + caracter;
        } else {
            String car = "" + this.caracter;
            return car.toUpperCase();
        }
    }

    @Override
    public void add(Componente componente) {
        if(componente.esCompuesto()){
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }

}
