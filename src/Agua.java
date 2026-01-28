public class Agua extends Congelado {
    double salinidad;

    public Agua(String fecha_Caducidad, int num_lote, String fecha_Envasado, String pais_Origen, double temperatura,
            double salinidad) {
        super(fecha_Caducidad, num_lote, fecha_Envasado, pais_Origen, temperatura);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

}
