public class Int2 extends Int1 {
    double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLa Temperatura: " + getTemperatura();
    }

}
