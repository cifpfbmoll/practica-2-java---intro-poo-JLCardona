public class Persona {
    private String nombre;
    private String apellidos;
    private String nif;
    private String contrasenya;

    public Persona(String nombre, String apellidos, String nif, String contrasenya) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.contrasenya = contrasenya;
    }

    public Persona(Persona copia) {
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.nif = copia.nif;
        this.contrasenya = copia.contrasenya;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                '}';
    }
}
