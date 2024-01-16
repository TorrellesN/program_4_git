import java.util.Comparator;

public class TituloComparator implements Comparator<Libro> {

    //El método abstracto compare compara los titulos de ambos libros.
    //Al ser un objeto de tipo String, puedo comparar medoiante su método implementado "compareTo"
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }

}
