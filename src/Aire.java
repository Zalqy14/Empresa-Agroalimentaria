public class Aire extends Congelado {
    double nitrogeno;
    double oxigeno;
    double co2;
    double vapor_Agua;

    public Aire(String fecha_Caducidad, int num_lote, String fecha_Envasado, String pais_Origen, double temperatura,
            double nitrogeno,
            double oxigeno, double co2, double vapor_Agua) {
        super(fecha_Caducidad, num_lote, fecha_Envasado, pais_Origen, temperatura);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vapor_Agua = vapor_Agua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getVapor_Agua() {
        return vapor_Agua;
    }

    public void setVapor_Agua(double vapor_Agua) {
        this.vapor_Agua = vapor_Agua;
    }

}
