public class Fecha {

    private String dia;
    private String mes;
    private int ano;

    public Fecha(String dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //getters y setters
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //toString, si no, desde la clase Libro no podemos sacar por pantalla los atributos de la clase
    // fecha correctamente

    @Override
    public String toString() {
        return dia + " de " + mes + " de " + ano;
    }
}
