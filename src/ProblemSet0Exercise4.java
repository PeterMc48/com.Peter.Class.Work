import javax.swing.*;

public class ProblemSet0Exercise4 {
    public static void main(String[] args) {

        int number=0,i=0,totalNum=0;
        String num;
        num = JOptionPane.showInputDialog("Please enter a number");

        while(!num.equals("q")) {
            if (num == null)
            {
                if (num.charAt(0) == '-' && num.length() == 1)
                {
                    for (int j = 1; j < num.length(); j++)
                    {
                        char n = num.charAt(j);
                        if (n < '0' || n > '9')
                        {
                            num = JOptionPane.showInputDialog("Please enter a prositive or negative number");

                        }
                        else

                            number = Integer.parseInt(num);
                            i++;
                            totalNum +=number;
                    }
                }
            }

            }

            num = JOptionPane.showInputDialog("Please enter a number");



            JOptionPane.showMessageDialog(null, "you entered a number this many times: "+i+
                                                                         "\nThe total of all the numbers entered is: "+totalNum);
    }
}
