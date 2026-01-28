public class Nitrogeno extends Congelado {
    String metodo_Empleado;
    double tiempo_Expuesto;
    public Nitrogeno(String fecha_Caducidad, int num_lote, String fecha_Envasado, String pais_Origen,
            double temperatura, String metodo_Empleado, double tiempo_Expuesto) {
        super(fecha_Caducidad, num_lote, fecha_Envasado, pais_Origen, temperatura);
        this.metodo_Empleado = metodo_Empleado;
        this.tiempo_Expuesto = tiempo_Expuesto;
    }
    public String getMetodo_Empleado() {
        return metodo_Empleado;
    }
    public void setMetodo_Empleado(String metodo_Empleado) {
        this.metodo_Empleado = metodo_Empleado;
    }
    public double getTiempo_Expuesto() {
        return tiempo_Expuesto;
    }
    public void setTiempo_Expuesto(double tiempo_Expuesto) {
        this.tiempo_Expuesto = tiempo_Expuesto;
    }
    
}
