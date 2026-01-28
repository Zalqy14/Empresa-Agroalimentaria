public class Fresco extends Int1 {
    public Fresco(String fecha_Caducidad, int num_lote, String fecha_Envasado, String pais_Origen) {
        super.fecha_Caducidad = fecha_Caducidad;
        super.num_lote = num_lote;
        super.fecha_Envasado = fecha_Envasado;
        super.pais_Origen = pais_Origen;
    }

    @Override
    public String toString() {
        return "Tipo Producto: Producto Fresco\n" + super.toString();
    }
}
