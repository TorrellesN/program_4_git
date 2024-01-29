public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    @Override
    public int compareTo(Libro l2) {
        return (this.titulo).compareTo(l2.titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Libro)){
            return false;
        }

        Libro l2 = (Libro) obj;
        if (this.autor.equals(l2.autor) && this.titulo.equals(l2.titulo)){
            return true;
        }
        return false;
    }
}
