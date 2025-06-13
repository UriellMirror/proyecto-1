//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro[] libros =  {
                new Libro("La mascara","Uriell", 2022 ,true),
                new Libro("Eso Suarez", "Wendy", 2025 , true),
                new Libro("Lo que la vida fue", "Armando", 2021 , false)
        };



        for (Libro var : libros){
            System.out.println(var.toString());
            var.prestar();
        }
    }
}