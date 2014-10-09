package es.upm.miw.pd.state.connection;

public class Conexion {
    private EstadoObjeto estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return estado.getEstado();
    }

    public void setEstado(EstadoObjeto estado){
        this.estado = estado;
    }
    
    public void abrir(){
        estado.abrir(this);
    }
    
    public void cerrar(){
        estado.cerrar(this);
    }
    
    public void iniciar(){
        estado.iniciar(this);
    }
    
    public void parar(){
        estado.parar(this);
    }
    
    public void enviar(String msg){
        estado.enviar(this, msg, link);
    }
    
    public void recibir(int respuesta){
        estado.recibir(this, respuesta);
    }

}
