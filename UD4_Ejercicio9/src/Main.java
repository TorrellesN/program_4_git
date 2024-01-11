import java.util.ArrayList;
import java.util.List;

/**
 *Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro:
 * título, autor (usa la clase Persona), ISBN, páginas, edición, editorial, lugar (ciudad y país)
 * y fecha de edición (usa la clase Fecha). La clase debe proporcionar los siguientes servicios:
 * getters y setters, método para leer la información y método para mostrar la información.
 * Este último método mostrará la información del libro con el siguiente formato:
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