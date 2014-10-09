package es.upm.miw.pd.state.connection;

public class Esperando extends EstadoObjeto{

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
        throw new UnsupportedOperationException("Acción no permitida... ");             
    }

    @Override
    public void iniciar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");             
    }

    @Override
    public void enviar(Conexion conection, String msg, Link link) {
        throw new UnsupportedOperationException("Acción no permitida... ");             
    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        if(respuesta == 0){
            conection.setEstado(new Preparado());
        }else{
            conection.setEstado(new Cerrado());
        }
    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

}
