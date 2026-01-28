public class Congelado extends Int2 {
    public Congelado(String fecha_Caducidad, int num_lote, String fecha_Envasado, String pais_Origen,
            double temperatura) {
        super.fecha_Caducidad = fecha_Caducidad;
        super.num_lote = num_lote;
        super.fecha_Envasado = fecha_Envasado;
        super.pais_Origen = pais_Origen;
        super.temperatura = temperatura;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
