package pe.edu.vallegrande;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " está encendiendo con patada");
    }
}
