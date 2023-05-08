public class Simple extends Carga{

    private double pesoCarga;
    private boolean requiereRefrigeracion;

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    @Override
    public double calcularPeso() {
        return requiereRefrigeracion ? pesoCarga + 2 : pesoCarga;
    }

    @Override
    public String toString() {
        String msgRefrigeracion = requiereRefrigeracion ? "Si" : "No";
        return "Simple{" + "\n" +
                "pesoCarga=" + pesoCarga + "\n" +
                ", requiereRefrigeracion=" + msgRefrigeracion + "\n" +
                '}' + "\n";
    }
}
