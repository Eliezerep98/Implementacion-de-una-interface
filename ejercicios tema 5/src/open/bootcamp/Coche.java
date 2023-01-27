package open.bootcamp;

public class Coche {

    String modelo;
    int año;
    double precio;
    int velocidad;
    public Coche() {}

    public Coche(String modelo, int año, double precio, int velocidad) {
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                ", velocidad=" + velocidad +
                '}';
    }
}
