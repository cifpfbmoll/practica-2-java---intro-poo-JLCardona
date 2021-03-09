import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    public static Scanner sc=new Scanner(System.in);
    //ATRIBUTOS
    private long isbn; //para numeros largos un LONG o algo de eso, esta en el classroom
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisp;
    //CONSTRUCTORES
    public Libro() {

    }

    public Libro(long isbn, String titulo, String autor, String editorial, int numCopias, int numCopiasDisp) {
        if (numCopias < 1){
            System.out.println("El numero de copias debe ser minimo 1 ");
        }
        else {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.numCopias = numCopias;
            this.numCopiasDisp = numCopiasDisp;
        }

    }

    public Libro(Libro copia) {
        this.isbn = copia.isbn;
        this.titulo = copia.titulo;
        this.autor = copia.autor;
        this.editorial = copia.editorial;
        this.numCopias = copia.numCopias;
        this.numCopiasDisp = copia.numCopiasDisp;
    }

    //GETTERS & SETTERS

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        while (numCopias< 1){
            System.out.println("¡ERROR! Debe haber minimo una copia. ");
            System.out.println("Inserte de nuevo : ");
            numCopias=sc.nextInt();
            sc.nextLine();
        }
            this.numCopias = numCopias;

    }



    public int getNumCopiasDisp() {
        return numCopiasDisp;
    }

    public void setNumCopiasDisp(int numCopiasDisp,int numCopias) {
        while(numCopias<numCopiasDisp || numCopiasDisp<0){
            if (numCopias<numCopiasDisp){
                System.out.println("¡ERROR! No pueden haber mas copias de las iniciales.");
                System.out.println("Inserte de nuevo : ");
                numCopiasDisp=sc.nextInt();
            }
            else if (numCopiasDisp<0){
                System.out.println("¡ERROR! Las copias nunca seran 0 o negativo.");
                System.out.println("Inserte de nuevo : ");
                numCopiasDisp=sc.nextInt();
            }
        }
        this.numCopiasDisp = numCopiasDisp;
    }


    //Contador de libros va por los titulos de los libros, no por sus copias, es independiente de las copias. EJ : hay alomejor 3 libros diferentes pero cada uno tiene varais copias pues el contador marcara un 3.
    //Instancia objeto concreto, statico pertenece a todos.
    //Despues de un nextIn mejor poner un nextLine.



    //METODO SOBREESCRITO (SUELE IR ABAJO Y SEGUIDO LOS METODOS)


    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numCopias=" + numCopias +
                ", numCopiasDisp=" + numCopiasDisp +
                '}';
    }

    //METODOS
    public static Libro contadorLibros() {
        Scanner lector = new Scanner(System.in);
        Libro l1=new Libro();
        //si es estatico se puede utilizar algo como Libro.contadorLibros++;
        //PUEDE QUE NECESITO ALGUN ARAY LIST EN ALGUN MOMENTO O ACTIVIDAD???

        return l1;
    }
    public static void anyadirLibros(ArrayList<Libro> listaLibros) {
        Libro libro = new Libro();//INICIALIZAR EL OBJETO LIBRO
        Scanner lector = new Scanner(System.in);
        System.out.println("Para añadir el libro digame lo siguiente : ");
        System.out.println("ISBN : ");
        libro.setIsbn(lector.nextLong());
        lector.nextLine();
        System.out.println("Titulo : ");
        libro.setTitulo(lector.nextLine());
        System.out.println("Autor : ");
        libro.setAutor(lector.nextLine());
        System.out.println("Editorial : ");
        libro.setEditorial(lector.nextLine());
        System.out.println("Copias Iniciales : ");
        int numCopias=sc.nextInt();
        sc.nextLine();
        libro.setNumCopias(numCopias);
        lector.nextLine();
        System.out.println("Copias Disponibles : ");
        int NumCopiasDisp=sc.nextInt();
        sc.nextLine();
        libro.setNumCopiasDisp(NumCopiasDisp,numCopias);
        listaLibros.add(libro);
    }
    public static void eliminarLibro(ArrayList<Libro> listaLibros) {
        boolean encontrado=false;
        System.out.println("Escribe la ISBN del libro");
        Long isbn=sc.nextLong();
        sc.nextLine();
        for (int i=0; i<listaLibros.size();i++){
            if (isbn.equals(listaLibros.get(i).getIsbn())){
                encontrado=true;
                if( (listaLibros.get(i).getNumCopias())!=(listaLibros.get(i).getNumCopiasDisp()) ){ //No se podrá eliminar ningun libro con reservas
                    System.out.println("No se puede eliminar un libro con reservas");
                }
                else{
                    System.out.println("Eliminando libro... "+(listaLibros.get(i).getTitulo()));
                    listaLibros.remove(i);
                }
            }
        }
        if (!encontrado){
            System.out.println("No hay ningun libro con esa ISBN.");
        }


    }
    public static int buscadorIsbn(ArrayList<Libro> listaLibros) {
        System.out.println("Escribe la ISBN del libro : ");
        Long isbn=sc.nextLong(); //Esto es el Scanner (sc es el scanner global, isbn el input(donde meteremos el valor))
        sc.nextLine();
        int posicion=-1;
        for (int i=0; i<listaLibros.size();i++){
            if (isbn.equals(listaLibros.get(i).getIsbn())){
                posicion=listaLibros.lastIndexOf(listaLibros.get(i));
            }
        }
        return posicion;
    }

    public static void buscadorTitulo(ArrayList<Libro> listaLibros) {
        boolean encontrado=false;
        System.out.println("Escribe el titulo del libro : ");
        String titulo=sc.nextLine();
        for (int i=0; i<listaLibros.size();i++){
            if (titulo.contains(listaLibros.get(i).getTitulo())){
                encontrado=true;
                System.out.println("Libro/s : "+listaLibros.get(i).toString());
                }
            }
        if (!encontrado){
            System.out.println("No hay ningun libro con ese titulo.");
        }
    }
}

