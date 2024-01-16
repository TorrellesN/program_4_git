import java.util.Comparator;

public class TituloComparator implements Comparator {


    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getTitulo() - o2.getTitulo();
    }
}
