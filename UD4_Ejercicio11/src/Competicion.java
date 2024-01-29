import java.util.Iterator;
import java.util.TreeSet;

public class Competicion {

    private String nombre;

    private TreeSet<Equipo> miembrosComp;

    public Competicion (String nombre){
        this.nombre = nombre;
    }

    //meter miembros en competicion
    public void addEquipo (Equipo equipo){
        this.miembrosComp.add(equipo);
    }

    public void removeEquipo (Equipo equipo){
        this.miembrosComp.remove(equipo);
    }

    public void listaCompeticion(){
        Iterator<Equipo> it = this.miembrosComp.iterator();
        while (it.hasNext()){

            Equipo e = it.next();
            System.out.println(e);

        }
    }


}
