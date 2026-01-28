public class Int1 extends Producto {
    String pais_Origen;
    String fecha_Envasado;

    public String getPais_Origen() {
        return pais_Origen;
    }

    public void setPais_Origen(String pais_Origen) {
        this.pais_Origen = pais_Origen;
    }

    public String getFehca_Envasado() {
        return fecha_Envasado;
    }

    public void setFehca_Envasado(String fehca_Envasado) {
        this.fecha_Envasado = fehca_Envasado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha Envasado: " + getFehca_Envasado() + "\nPais de Origen: " + getPais_Origen();

    }

}
