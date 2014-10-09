package es.upm.miw.pd.state.connection;

public class Parado extends EstadoObjeto{

    @Override
    public void abrir(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void cerrar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void parar(Conexion conection) {        
    }

    @Override
    public void iniciar(Conexion conection) {
        conection.setEstado(new Preparado());
    }

    @Override
    public void enviar(Conexion conection, String msg, Link link) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

}
