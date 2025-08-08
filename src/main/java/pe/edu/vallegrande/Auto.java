package pe.edu.vallegrande;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}