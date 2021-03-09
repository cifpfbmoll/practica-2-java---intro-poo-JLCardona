import java.util.ArrayList;

public class Biblioteca {
    private String nombreBiblioteca;
    //OPCION 1 : private ArrayList<Libros> listaLibros=new ArrayList();
    private ArrayList<Libro> listaLibros = new ArrayList();
    private ArrayList<Persona> listaPersonal = new ArrayList();

    public Biblioteca() {
        //OPCION 2 : this.listaLibros=new ArrayList();
        //OPCION 3 : no hacer nada y ver como salta lo del NULL o lo q haya dicho.
    }

    public Biblioteca(String nombreBiblioteca, ArrayList listaLibros, ArrayList listaPersonal) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
    }

    public Biblioteca(Biblioteca copia) {
        this.nombreBiblioteca = copia.nombreBiblioteca;
        this.listaLibros = copia.listaLibros;
        this.listaPersonal = copia.listaPersonal;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        /*if (nombreBiblioteca != nombreBiblioteca.upperCaseFirst()){
            System.out.println("¡ERROR! El nombre debe empezar por mayúsculas. ");
        }
        else {
            this.nombreBiblioteca = nombreBiblioteca;
        }*/
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Persona> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList<Persona> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", listaLibros=" + listaLibros +
                ", listaPersonal=" + listaPersonal +
                '}';
    }

    public void mostrarLibros(){

    }

}
