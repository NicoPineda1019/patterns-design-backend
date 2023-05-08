public class Main {
    public static void main(String[] args) {

        System.out.println("EXAMEN FINAL POO - NICOLAS PINEDA LOPEZ!");

        Barco barco = new Barco("Titanic");

        Carga simpleTv = CargaFactory.getInstance().crearCarga("Simple");
        simpleTv.setNombre("TV 32’ LCD");
        simpleTv.setDescripcion("Este es un TV");
        ( (Simple) simpleTv).setPesoCarga(3);
        ( (Simple) simpleTv).setRequiereRefrigeracion(false);

        Carga simpleCaja = CargaFactory.getInstance().crearCarga("Simple");
        simpleCaja.setNombre("caja de medicamentos");
        simpleCaja.setDescripcion("Esta es una caja de medicamentos");
        ( (Simple) simpleCaja).setPesoCarga(2);
        ( (Simple) simpleCaja).setRequiereRefrigeracion(true);

        Carga contenedor = CargaFactory.getInstance().crearCarga("Contenedor");
        contenedor.setNombre("Contenedor Pesado");
        contenedor.setDescripcion("Este es un contenedor de 2 cargas");
        ( (Contenedor) contenedor).setPesoContenedor(100);
        ( (Contenedor) contenedor).agregarCarga(simpleTv);
        ( (Contenedor) contenedor).agregarCarga(simpleCaja);

        barco.agregarCarga( contenedor );
        barco.mostrarCargas();
    }
}