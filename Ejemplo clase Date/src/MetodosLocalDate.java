import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class MetodosLocalDate {

    public static void sumaDias (){
        //Calcular la suma y resta de días
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de días y los sumaré a la fecha actual", "Calculador de fecha", JOptionPane.WARNING_MESSAGE));


        JOptionPane. showMessageDialog(null, (LocalDate.now()).plusDays(dias), "Calculador de fecha", JOptionPane.WARNING_MESSAGE);

    }

    public static void selectorSumaTiempo (){
        //Calcular la suma y resta con tiempo minutos, segundos... Para ello hay que usar LocalDateTime
        String[] opciones = {"Calcular horas", "Calcular minutos", "Calcular segundos"};
        String opcionE =  String.valueOf( JOptionPane.showOptionDialog(null, "Opciones", "Calculador de fecha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null ,opciones , "Calcular horas") );
        int opcion = Integer.parseInt(opcionE);

        switch (opcion){

            case 0 : SumaHoras(); break;
            case 1 : SumaMinutos(); break;
            case 2 : SumaSegundos(); break;

        }
    }

    public static void SumaHoras (){
        int horas = Integer.parseInt ( JOptionPane.showInputDialog(null, "Inserta un número de horas", "Calculador de tiempo", JOptionPane.DEFAULT_OPTION) );
        String horaFinal = String.format(String.valueOf((LocalTime.now()).plusHours(horas)));
        JOptionPane.showMessageDialog(null, "Sumando las horas que introdujiste, la hora final es " + horaFinal, "Calculador de tiempo", JOptionPane.DEFAULT_OPTION);
    }
    public static void SumaMinutos (){
        int minutos = Integer.parseInt ( JOptionPane.showInputDialog(null, "Inserta un número de minutos", "Calculador de tiempo", JOptionPane.DEFAULT_OPTION) );
        String horaFinal = String.format(String.valueOf((LocalTime.now()).plusMinutes(minutos)));
        JOptionPane.showMessageDialog(null, "Sumando las horas que introdujiste, la hora final es " + horaFinal, "Calculador de tiempo", JOptionPane.DEFAULT_OPTION);
    }
    public static void SumaSegundos (){
        int segundos = Integer.parseInt ( JOptionPane.showInputDialog(null, "Inserta un número de segundos", "Calculador de tiempo", JOptionPane.DEFAULT_OPTION) );
        String horaFinal = String.format(String.valueOf((LocalTime.now()).plusSeconds(segundos)));
        JOptionPane.showMessageDialog(null, "Sumando las horas que introdujiste, la hora final es " + horaFinal, "Calculador de tiempo", JOptionPane.DEFAULT_OPTION);
    }
}
