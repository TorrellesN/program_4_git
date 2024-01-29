public class Alumno {

    private String centroEducativo;
    private String dni;
    private String nombre;
    private String apellido;

    public Alumno(String centroEducativo, String dni, String nombre, String apellido) {
        this.centroEducativo = centroEducativo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //comparara con equals para que los alumnos se entiendan por duplicados
    // solo si tienen el mismo dni pero no el mismo nombre o apellido


    @Override
    public boolean equals(Object obj){
        if (obj instanceof Alumno){
            Alumno o1 = (Alumno)obj;
            if(o1.dni.equals(this.dni)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nombre + "\n";
    }
}
