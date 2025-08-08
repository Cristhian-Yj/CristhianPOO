package pe.edu.vallegrande;


public class Main {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Honda", "CBR600");

        ((Auto) miAuto).clone();
        miMoto.clone();

        System.out.println("Marca del auto: " + miAuto.getMarca());
        System.out.println("Modelo de la moto: " + miMoto.getModelo());
    }
}