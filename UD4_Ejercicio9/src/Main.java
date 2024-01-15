import java.util.ArrayList;
import java.util.List;

/**
 *Vamos a crear una colección de libros mejorada.
 * Utilizaremos la clase Libro y todas las demás necesarias
 * (si estás trabajando en el mismo proyecto puedes acceder a ellas.
 * Si no haz una copia en tú proyecto). Vamos a modificar la clase lista de Libros,
 * que en este caso va a estar definida en una clase llamada ArrayListLibros.
 */
public class Main {
    public static void main(String[] args) {

        Persona autor1 = new Persona("Lola", "Montes");
        Persona autor2 = new Persona("Junji", "Ito");

        Fecha fecha1 = new Fecha("viernes 12", "abril", 2009);
        Fecha fecha2 = new Fecha("jueves 23", "mayo", 2013);

        Lugar lugar1 = new Lugar("Tokio", "Japón");
        Lugar lugar2 = new Lugar("Rotterdam", "Países Bajos");

        Libro l1 = new Libro("La redención", autor1, "12345", 256, "primera", "Avanta", fecha1, lugar1);
        Libro l2 = new Libro("Uzumaki", autor2, "12953", 86, "segunda", "Norma", fecha2, lugar2);
        Libro l3 = new Libro ("Gio", autor2, "57694", 210, "tercera", "Norma", fecha1, lugar2);

        l2.muestraLibro();
        l1.muestraLibro();
        l3.muestraLibro();







    }
}