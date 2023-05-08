public class CargaFactory {

    private static CargaFactory instancia;

    public CargaFactory() {
    }

    public static CargaFactory getInstance(){
        if (instancia == null) {
            instancia = new CargaFactory();
        }
        return instancia;
    }

    public Carga crearCarga(String tipo){
        switch (tipo){
            case "Simple":
                return new Simple();
            case "Contenedor":
                return new Contenedor();
            default:
                throw new RuntimeException("No existe este tipo");
        }
    }
}
