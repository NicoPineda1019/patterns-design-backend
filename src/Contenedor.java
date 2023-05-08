import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{

    private double pesoContenedor;
    private List<Carga> cargas= new ArrayList<>();

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    @Override
    public double calcularPeso() {
        double sumaCargas = 0.;
        for (Carga c:cargas) {
            sumaCargas += c.calcularPeso();
        }
        return sumaCargas + pesoContenedor;
    }
    public void agregarCarga( Carga carga){
        cargas.add(carga);
    }

}
