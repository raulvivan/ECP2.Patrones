package es.upm.miw.pd.command;

public class Calculadora {

    private int total;
    
    private int anteriorTotal;

    public Calculadora() {
        this.iniciar();
    }

    public int getTotal() {
        return total;
    }
    
    public int getAnteriorTotal(){
        return this.anteriorTotal;
    }

    protected void setTotal(int total) {
        this.anteriorTotal = this.total;
        this.total = total;
    }

    public void sumar(int valor) {
        this.setTotal(this.total + valor);
    }

    public void restar(int valor) {
        this.setTotal(this.total - valor);
    }

    public void iniciar() {
        this.setTotal(0);
    }
    
    public void deshacer(){
        this.total = this.anteriorTotal;
    }

}
