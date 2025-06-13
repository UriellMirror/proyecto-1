public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String disponibleTexto =  disponible ? "Si" : "No";
        return "Titulo: "+titulo+", Autor:"+autor +", anio:"+anioPublicacion+"Disponible: "+" "+disponibleTexto;
    }

    public void prestar(){
                if (disponible){
                    disponible = false;
                    System.out.println("El libro"+titulo+"ha sido prestado");
                }
                else {
                    System.out.println("Libro no disponible para prestamos");
                }
        }
}
