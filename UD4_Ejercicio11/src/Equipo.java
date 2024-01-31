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
        this.miembros = new HashSet<>();
    }


    //getters y setters



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



    // añade miembro
    public void addMiembro (Alumno miembro){
        this.miembros.add(miembro);
        this.n_miembros ++;
    }
    //elimina un miembro introduciendo el objeto
    public void removeMiembro (Alumno miembro){

        miembros.remove(miembro);
        this.n_miembros --;

    }

    //elimina un miembro introduciendo su dni
    public void removeMiembro_porNombre(String dni){
        for (Alumno a : this.miembros){
            if (a.getDni() == dni){
                this.miembros.remove(a);
                this.n_miembros --;

            }
        }
    }

    //no permite duplicados del equipo en la competicion
    // comparando con equals el nombre
    //NO HACE FALTA: TREESET COMPARA CON COMPARETO
    //@Override
    /*public boolean equals(Object obj){
        if (!(obj instanceof Equipo)){
            return false;
        }
        Equipo o1 = (Equipo)obj;
        if(o1.nombre.equals(this.nombre)){
            return true;
        }
        return false;
    }*/

    //METODO PARA LISTAR MIEMBROS EQUIPO
    public void imprimirMiembros (){
        System.out.println("Miembros de " + this.nombre);
        for (Alumno m : this.miembros){
            System.out.println(m);
        }
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
