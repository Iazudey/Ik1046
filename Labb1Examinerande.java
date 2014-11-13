import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Labb1examinerande {
    
     public static void main(String[] args){
        
         
         NumberFormat formatering = NumberFormat.getInstance();
         System.out.println("Ange radie: ");
         Scanner input= new Scanner(System.in); 
        
         double radie=input.nextDouble();
         double omkrets= (Math.PI*(radie*2));
         double area= (Math.pow(radie,2)*Math.PI);
         double diameter= radie*2; 
         
JOptionPane.showMessageDialog(null, "Diametern är " + formatering.format(diameter) + "cm", "angiven radie: " + radie, JOptionPane.INFORMATION_MESSAGE); 
JOptionPane.showMessageDialog(null, "Omkretsen är " +formatering.format(omkrets) + "cm", "angiven radie: " + radie, JOptionPane.INFORMATION_MESSAGE); 
JOptionPane.showMessageDialog(null, "Arean är: " +formatering.format(area) + " kvadratcentimeter", "angiven radie: " + radie, JOptionPane.INFORMATION_MESSAGE);
}

}
