//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
                new Auto("Hiunday ", "Creta ", 2026, 5),
                new Motocicleta("Mortalika ","Mortal ", 2001, " Nose"),
                new Auto("Toyota ", "CIVIC", 2020, 4),
                new Motocicleta("Mortalik ", "Quiensabe ", 2020,"Quensabe ")
        };

        vehiculos[1].acelerar(200);
        vehiculos[0].acelerar(100);
        vehiculos[2].acelerar(160);
        vehiculos[3].acelerar(150);

        vehiculos[0].frenar(50);
        vehiculos[1].frenar(110);
        vehiculos[2].frenar(75);
        vehiculos[3].frenar(60);

        for ( Vehiculo variable : vehiculos){
            variable.mostrarDetalles();
        }


    }
}