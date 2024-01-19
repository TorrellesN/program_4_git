import netscape.javascript.JSObject;

import javax.swing.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

//LocalDate es un package mas nuevo que Date, por lo tanto hay que implementar este
public class Main {
    public static void main(String[] args) {

        //Calcular la suma y resta de días
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de días", "Calculador de fecha", JOptionPane.WARNING_MESSAGE));


        JOptionPane. showMessageDialog(null, (LocalDate.now()).plusDays(dias), "Titulo", JOptionPane.WARNING_MESSAGE);

        System.out.println((LocalDate.now()).plusDays(dias));

        //Calcular la suma y resta con tiempo minutos, segundos... Para ello hay que usar LocalDateTime


    }
}