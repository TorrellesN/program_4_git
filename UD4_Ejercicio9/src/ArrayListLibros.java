import java.util.ArrayList;

public class ArrayListLibros {
    ArrayList<Libro> coleccion= new ArrayList <>();

    public ArrayListLibros() {}

    //muestra toda la coleccion por pantalla
    public void mostrarColeccion (){
        System.out.println("-------- LISTA DE LIBROS --------");
        for (Libro c : this.coleccion){
            c.muestraLibro();
        }
        System.out.println("----------------------------------");
    }

    //insertar libros
    public void insertar (Libro li){
        this.coleccion.add(li);
    }

    //devuelve el numero de elementos del array
    public int numLibros (){
       return this.coleccion.size();
    }

    //elimina el elemento de la posicion indicada
    public void eliminarLibro(int posicion){
        this.coleccion.remove(posicion);
    }

    //devuelve el libro de esa posicionh
    public Libro obtenerLibro (int posicion){
        return this.coleccion.get(posicion);
    }

    //un foreach que recorre arraylist, dentro compara el titulo con la palabra y devuelve el índice(posicion del libro) con "indexOf".
    //Si no devuelve un negativo, porque no está en ninguna posición válida del arrayList
    public int buscarLibro(String buscada){
        for (Libro li : this.coleccion){
            if (li.getTitulo().equals(buscada)){
                return coleccion.indexOf(li);
            }
        }
        return -1;
    }

    //implementación de la interfaz Comparator a partir de la clase TituloComparator
    //De normal usaría collections.sort, pero ArrayList tiene su propios método sort, que se llama "list.sort"
    public void ordenarPorTitulo (){
       this.coleccion.sort(new TituloComparator());
    }

    public void ordenarPorPaginas(){
        this.coleccion.sort(new PaginasComparator());
    }

}
