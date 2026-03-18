import javax.swing.*;

public class TimeConverter {
    public static void main(String[] args) {
        final int secondsPerMinute = 60;
        final int secondsPerHour = 3600;
        final int secondsPerDay = 86400;
        String input = JOptionPane.showInputDialog(null, "Enter number of seconds");
        if(input.matches("\\d+")){
        int timeInSeconds = Integer.parseInt(input);

        int days = timeInSeconds / secondsPerDay;
        int remainingAfterDays = timeInSeconds % secondsPerDay;

        int hours = remainingAfterDays / secondsPerHour;
        int remainingAfterHours = remainingAfterDays % secondsPerHour;

        int minutes = remainingAfterHours / secondsPerMinute;
        int remainingSeconds = remainingAfterHours % secondsPerMinute;


        JOptionPane.showMessageDialog(null, "Convertions from seconds" + "\n Remaining Second(s): " + remainingSeconds + "\nMinute(s): " + minutes + "\n Hour(s): " + hours + "\nDay(s): " + days + " ");
        }
        else{
            JOptionPane.showMessageDialog(null, input + " is not seconds, please try again!");
        }
        
    }
}
