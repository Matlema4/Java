import javax.swing.*;

public class CharacterAnalyzer {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
        String input = JOptionPane.showInputDialog(null, "Enter a single character: ");
        if(input.length() ==1){
        char letterChar = input.charAt(0);
        if(Character.isUpperCase(letterChar)){
            JOptionPane.showMessageDialog(null, letterChar + " is an Uppercase character");
        }
        else if(Character.isLowerCase(letterChar)){
            JOptionPane.showMessageDialog(null, letterChar + " is an Lowercase character");
        }
        else if(Character.isDigit(letterChar)){
            JOptionPane.showMessageDialog(null, letterChar + " is a digit");
        }
        else{
            JOptionPane.showMessageDialog(null, letterChar + " is a symbol character");
        }
    }else{
        JOptionPane.showMessageDialog(null, input + " is not a single character please try again! ");
    }
}
}
}