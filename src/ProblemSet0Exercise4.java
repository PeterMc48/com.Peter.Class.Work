import javax.swing.*;

public class ProblemSet0Exercise4 {
    public static void main(String[] args) {

        int number,i=0,totalNum=0;
        String num;
        num = JOptionPane.showInputDialog("Please enter a number");

        while(!num.equals("q")){




            number = Integer.parseInt(num);

            i++;

            totalNum +=number;
            num = JOptionPane.showInputDialog("Please enter a number");

        }

            JOptionPane.showMessageDialog(null, "you entered a number this many times: "+i+
                                                                         "\nThe total of all the numbers entered is: "+totalNum);
    }
}
