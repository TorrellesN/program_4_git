import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro> {

    // comparator que ordena de menor a mayor, por lo que resta las páginas
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getPaginas() - o2.getPaginas();
    }
}
