//  importing of the JOptionPane class in the swing package

import javax.swing.JOptionPane;

// class delcaration subject to the name of the java file
public  class DialogBox{

  // main method declaration

  public static void main(String[] args) {

  // Delcaring string varialbles to be displayed in the DialogBox.

    String message;
    Sting title_Bar;

// invoking the showMessageDialog method of the class JOptionPane    

      JOptionPane.showMessageDialog(null,message,title_Bar,JOptionPane.INFORMATION_MESSAGE);
  }
}
