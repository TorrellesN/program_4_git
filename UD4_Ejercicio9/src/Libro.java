import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titulo;
    private Persona autor;
    private String ISBN;
    private int paginas;
    private String edicion;
    private String editorial;
    private Fecha fechaEdicion;
    private Lugar lugar;



    //constructor
    public Libro(String titulo, Persona autor, String ISBN, int paginas, String edicion, String editorial, Fecha fechaEdicion, Lugar lugar) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.fechaEdicion = fechaEdicion;
        this.lugar = lugar;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }
    public Lugar getLugar(){
        return lugar;
    }


    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }
    public void setLugar (Lugar lugar){
        this.lugar = lugar;
    }



    public void muestraLibro (){
        System.out.println("Título: " + this.titulo);
        System.out.println(this.edicion + " edición");
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println(this.lugar + ", " + this.fechaEdicion);
        System.out.println(this.paginas + " páginas");
        System.out.println(" ");

    }

}
