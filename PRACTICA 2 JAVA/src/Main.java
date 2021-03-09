import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Libro libro = new Libro();
            Biblioteca miBiblioteca = new Biblioteca();
            //Hacer switch para hacer un menú donde llame a los metodos.
           // switch ()
            //Bucle for que genere libros (libro 1,titulo1,etc...Libro 2, titulo 2...)
            Libro l1 = new Libro();
            l1.setAutor("Miguel de Cervantes");
            l1.setEditorial("Vicens Vives");
            l1.setIsbn(1231231231231l); //para numeros largos un LONG (esta en el classroom)
            l1.setTitulo("El ingenioso hidalgo Don Quijote de La Mancha");
            l1.setNumCopias(20);
            l1.setNumCopiasDisp(10, l1.getNumCopias());
            Libro l2 = new Libro();
            l2.setAutor("Antonio Machado");
            l2.setEditorial("Austral");
            l2.setIsbn(4564564564564l);
            l2.setTitulo("Soledades, galerías y otros poemas");
            l2.setNumCopias(20);
            l2.setNumCopias(10);
            Libro l3 = new Libro();
            l3.setAutor("Anónimo");
            l3.setEditorial("Teide");
            l3.setIsbn(7897897897897l);
            l3.setTitulo("El Lazarillo de Tormes");
            l3.setNumCopias(20);
            l3.setNumCopiasDisp(10,l3.getNumCopias());

            //static --> se crea el objeto en el mismo metodo, se utiliza cuando quieres pedir info mediante parametros para jugar con esos datos dentro de ese metodo.
            //instancia --> tu ya tienes tu informacion y en el main juegas con esos datos especificamente, se crea el objeto en el main.
    }
        public static void menu() {
                ArrayList<Libro> libro = new ArrayList<>();
                System.out.println("Escoge que desea hacer : ");
                System.out.println("1 --> Añadir libro");
                System.out.println("2 --> Eliminar libro");
                System.out.println("3 --> Buscar libro por ISBN");
                System.out.println("4 --> Buscar libro por titulo");
                Scanner lector = new Scanner(System.in);
                int opcion = lector.nextInt();
                switch (opcion){
                        case 1:
                                Libro.anyadirLibros(libro); //Lo llamo asi porque es static
                                break;
                        case 2:
                                Libro.eliminarLibro(libro);
                                break;
                        case 3:
                                Libro.buscadorIsbn(libro);
                                break;
                        case 4:
                                Libro.buscadorTitulo(libro);
                                break;
                }
        }
}
