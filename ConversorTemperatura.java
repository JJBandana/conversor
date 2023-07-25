import javax.swing.*;

public class ConversorTemperatura {
    public static void caf(double temp){
        JOptionPane.showMessageDialog(null, temp + "°C equivalen a " + (double) Math.round(((temp * 9/5)+32)*100d)/100 + " °F");
    }
}
