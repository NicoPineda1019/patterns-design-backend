public abstract class Carga {

    private String nombre;
    private String descripcion;

    public abstract double calcularPeso();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carga{" + "\n" +
                "nombre='" + nombre + '\'' + "\n" +
                ", descripcion='" + descripcion + '\'' + "\n" +
                ", Peso ='" + calcularPeso() + '\'' + "\n" +
                '}' + "\n" ;
    }
}
