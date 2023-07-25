import javax.swing.*;
public class ConversorMoneda {


    public static void convertir(double cantidad, String moneda) {
    double dolar = 283.5, euro = 300.09, libra = 350.19, yen = 1.93, won = 0.91;

        switch (moneda){
            case "De Pesos a Dolar":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad / dolar)*100d)/100 + " Dólares");
                break;
            case "De Pesos a Euro":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad / euro)*100d)/100 + " Euros");
                break;

            case "De Pesos a Libras":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad / libra)*100d)/100 + " Libras");
                break;

            case "De Pesos a Yen":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad / yen)*100d)/100 + " Yenes");
                break;

            case "De Pesos a Won Coreano":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad / won)*100d)/100 + " Wones Coreanos");
                break;

            case "De Dólar a Pesos":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad * dolar)*100d)/100 + " Pesos");
                break;
            case "De Euro a Pesos":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad * euro)*100d)/100 + " Pesos");
                break;
            case "De Libras a Pesos":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad * libra)*100d)/100 + " Pesos");
                break;
            case "De Yen a Pesos":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad * yen)*100d)/100 + " Pesos");
                break;
            case "De Won Coreano a Pesos":
                JOptionPane.showMessageDialog(null, "Tienes $" + (double) Math.round((cantidad * won)*100d)/100 + " Pesos");
                break;

        }
    }
}
