import java.util.ArrayList;
import java.util.List;

public class Barco {

    private String nombre;
    private List<Carga> cargas;

    public Barco(String nombre) {
        this.nombre = nombre;
        cargas = new ArrayList<>();
    }

    public void agregarCarga( Carga carga){
        cargas.add(carga);
    }
    public void mostrarCargas(){
        System.out.println("Barco: " + nombre);
        System.out.println("Las cargas son: \n***************************************");
        for (Carga carga : cargas) {
            System.out.println(carga + "\n---------------------------------------");
        }
        System.out.println("***************************************");

    }
}
