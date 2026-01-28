public class Producto {
    String fecha_Caducidad;
    int num_lote;

    public String getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(String fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public int getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(int num_lote) {
        this.num_lote = num_lote;
    }

    public String toString() {
        return "Fecha Caducidad: " + getFecha_Caducidad() + "\nNum Lote: " + getNum_lote();
    }
}
