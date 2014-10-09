package es.upm.miw.pd.state.connection;

public class Preparado extends EstadoObjeto{

    @Override
    public void abrir(Conexion conection) {
    }

    @Override
    public void cerrar(Conexion conection) {
        conection.setEstado(new Cerrado());
    }

    @Override
    public void parar(Conexion conection) {
        conection.setEstado(new Parado());
    }

    @Override
    public void iniciar(Conexion conection) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enviar(Conexion conection, String msg, Link link) {
        link.enviar(msg);
        conection.setEstado(new Esperando());
    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");             
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
