//Una empresa monta una competición para centros educativos de FP.
public class Main {
    public static void main(String[] args) {

        //metemos miembros en el equipo

        Equipo ganadores = new Equipo("ganadores", "pepito@gmail.com");

        ganadores.addMiembro(new Alumno("Pirámide", "2345f", "Juanito", "Pérez"));
        ganadores.addMiembro(new Alumno("Pirámide", "5678I", "Hernando", "Ramiro"));
        ganadores.addMiembro(new Alumno("Pirámide", "6783W", "Antonio", "Corcel"));

        Equipo campeones = new Equipo("campeones", "laura@gmail.com");

        Alumno alumno1 = new Alumno("Sierra de Guara", "1983R", "Laura", "Rodríguez");
        Alumno alumno2 = new Alumno("Sierra de Guara", "1983R", "Laura", "Rodríguez");
        Alumno alumno3 = new Alumno("Sierra de Guara", "2346f", "Carmen", "Lopez");

        campeones.addMiembro(alumno1);
        campeones.addMiembro(alumno2);
        campeones.addMiembro(alumno3);



        ganadores.imprimirMiembros();
        campeones.imprimirMiembros();

        Competicion carrera = new Competicion("carrera");

        carrera.addEquipo(campeones);
        carrera.addEquipo(ganadores);
        carrera.addEquipo(campeones);

        carrera.listaCompeticion();

    }
}