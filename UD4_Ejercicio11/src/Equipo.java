import java.util.HashSet;

public class Equipo implements Comparable<Equipo>{

    private HashSet<Alumno> miembros;
    private String nombre;
    private String email;
    private int n_miembros;

    public Equipo(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.n_miembros = 0;
    }


    //getters y setters


    public HashSet<Alumno> getMiembros() {
        return miembros;
    }

    public void setMiembros(HashSet<Alumno> miembros) {
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getN_miembros() {
        return n_miembros;
    }

    public void setN_miembros(int n_miembros) {
        this.n_miembros = n_miembros;
    }


    // añade miembro
    public void addMiembro (Alumno miembro){
        miembros.add(miembro);
    }
    //elimina un miembro introduciendo el objeto
    public void removeMiembro (Alumno miembro){

        miembros.remove(miembro);
    }

    //elimina un miembro introduciendo su dni
    public void removeMiembro_porNombre(String dni){
        for (Alumno a : this.miembros){
            if (a.getDni() == dni){
                this.miembros.remove(a);
            }
        }
    }

    //no permite duplicados del equipo en la competicion
    // comparando con equals el nombre
    public boolean equals(Object obj){
        if (obj instanceof Equipo){
            Equipo o1 = (Equipo)obj;
            if(o1.nombre.equals(this.nombre)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int compareTo(Equipo o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }


}
