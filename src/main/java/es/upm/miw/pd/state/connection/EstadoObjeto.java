package es.upm.miw.pd.state.connection;

public abstract class EstadoObjeto {

    public abstract void abrir(Conexion conection);

    public abstract void cerrar(Conexion conection);

    public abstract void parar(Conexion conection);

    public abstract void iniciar(Conexion conection);

    public abstract void enviar(Conexion conection, String msg, Link link);

    public abstract void recibir(Conexion conection, int respuesta);
    
    public abstract Estado getEstado();

}
