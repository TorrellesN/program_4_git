
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
        Persona autor3 = new Persona("Jorge Luis", "Borges");

        Fecha fecha1 = new Fecha("viernes 12", "abril", 2009);
        Fecha fecha2 = new Fecha("jueves 23", "mayo", 2013);
        Fecha fecha3 = new Fecha("jueves 25", "noviembre", 1916);

        Lugar lugar1 = new Lugar("Tokio", "Japón");
        Lugar lugar2 = new Lugar("Rotterdam", "Países Bajos");

        Libro l1 = new Libro("La redención", autor1, "12345", 256, "primera", "Avanta", fecha1, lugar1);
        Libro l2 = new Libro("Uzumaki", autor2, "12953", 86, "segunda", "Norma", fecha2, lugar2);
        Libro l3 = new Libro ("Gio", autor2, "57694", 210, "tercera", "Norma", fecha1, lugar2);

        l2.muestraLibro();
        l1.muestraLibro();
        l3.muestraLibro();

        ArrayListLibros miColeccion = new ArrayListLibros();

        //inserto libros y veo cuántos libros tiene mi coleccion
        miColeccion.insertar(l1);
        miColeccion.insertar(l2);
        miColeccion.insertar(l3);
        miColeccion.insertar(new Libro ("El Aleph", autor3, "05964", 185, "novena", "Avanta", fecha3, lugar2));

        System.out.println(miColeccion.numLibros());

        //elimino libro y veo cuantos hay en la coleccion
        miColeccion.eliminarLibro(1);
        System.out.println(miColeccion.numLibros());
        miColeccion.mostrarColeccion();
        miColeccion.insertar(l2);

        //uso del método muestralibro
        System.out.println("-------- Así funciona el método muestraLibro --------\n");
        miColeccion.obtenerLibro(3).muestraLibro();

        //busco libros en mi colección
        int posicion = miColeccion.buscarLibro("Gio");
        System.out.println("El libro que he encontrado es este: \n");
        miColeccion.obtenerLibro(posicion).muestraLibro();
        //en cambio ocurre esto si no encuentro el libro
        System.out.println("Si busco un libro que no está en la colección:");
        int posicion2 = miColeccion.buscarLibro("Holi");
        if (posicion2 < 0){
            System.out.println("ese libro no está en la coleccion");
        }

        //Ordeno la colección por título
        System.out.println("Colección ordenada por título: ");
        miColeccion.ordenarPorTitulo();
        miColeccion.mostrarColeccion();

        //Ordeno la coleccion por n. de páginas
        System.out.println("Colección ordenada por páginas");
        miColeccion.ordenarPorPaginas();
        miColeccion.mostrarColeccion();




    }
}