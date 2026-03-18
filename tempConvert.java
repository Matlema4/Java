import javax.swing.*;

public class tempConvert{
    public static void main(String[] args) {
        int choice = JOptionPane.showOptionDialog(null, "What do you want to convert?",
        "Select an Option", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, new Object[]{"0. Celcius to Fahreinheit","1. Fahreinheit to Celcius"}, args);
        if (choice == 0){
            String name1 = JOptionPane.showInputDialog( "Enter celcius: ");
            double Celcius1 = Double.parseDouble(name1);
            double Fahreinheit1 = (Celcius1*(1.8))+32;
            JOptionPane.showMessageDialog(null, "If Celcius = " + String.format("%.2f", Celcius1) + " D/C then Fahreinheit = " + Fahreinheit1 + " F/H");
        }
        else if(choice == 1){
            String name = JOptionPane.showInputDialog( "Enter Fahreinheit: ");
            double Fahreinheit = Double.parseDouble(name);
            double Celcius = (Fahreinheit-32)*(0.55555555555555556);
            JOptionPane.showMessageDialog(null, "If Fahreinheit = " + String.format("%.2f", Fahreinheit) + "F/H then Celcius = "+ Celcius + " D/C");
        }
    }
}