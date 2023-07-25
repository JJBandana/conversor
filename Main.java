import javax.swing.*;

public class Main {

    public static void main(String args[]){

        boolean flag = true;
        while (flag) {

            String respuesta = JOptionPane.showInputDialog(null,"Seleccione qué deseas convertir", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Selection").toString();

            switch (respuesta) {
                case "Conversor de Moneda":
                    String moneda = JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Selection").toString();
                    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:", "Mensaje", JOptionPane.PLAIN_MESSAGE);
                    if(isValidNumber(input)){
                        double number = Double.parseDouble(input);
                        ConversorMoneda.convertir(number, moneda);
                    }
                    break;
                case "Conversor de Temperatura":
                    System.out.println("Conversor de Temp");
                    String temp = JOptionPane.showInputDialog(null, "Digite los grados centígrados:", "Mensaje", JOptionPane.PLAIN_MESSAGE);
                    if(isValidNumber(temp)) {
                        double number = Double.parseDouble(temp);
                        ConversorTemperatura.caf(number);
                    }
                    break;
                default:
                    System.out.println("Default");
                    break;
            }

            int salida = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?");

            if (salida > 0) {
                JOptionPane.showMessageDialog(null, "Programa finalizado", "Fin del programa", JOptionPane.PLAIN_MESSAGE);
                flag = false;
            }
        }
    }

    public static boolean isValidNumber(String input){

        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x <= 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
