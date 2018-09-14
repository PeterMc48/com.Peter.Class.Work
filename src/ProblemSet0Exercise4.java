import javax.swing.*;

public class ProblemSet0Exercise4 {
    public static void main(String[] args) {

       getNumber();

    }
    public static void getNumber()
    {
        int number=0,i=0,totalNum=0;
        String num;
        num = JOptionPane.showInputDialog("Please enter a number");



        while(!num.equals("q") && !num.equals(""))
        {

            int j=1;
            for(;j<num.length();j++)

                if (!Character.isDigit(num.charAt(j)))
                    break;
            if (j == num.length()) {

                number = Integer.parseInt(num);
                i++;
                totalNum += number;

            }
            else

                num = JOptionPane.showInputDialog("Please enter a positive number:");



            num = JOptionPane.showInputDialog("Please enter a number");
        }


        JOptionPane.showMessageDialog(null, "you entered a number this many times: "+i+
                "\nThe total of all the numbers entered is: "+totalNum);
    }
}
