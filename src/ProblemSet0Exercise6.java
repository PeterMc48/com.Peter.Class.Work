import javax.swing.*;

public class ProblemSet0Exercise6 {
    public static void main(String[] args) {




         float fNumber = getFNumber();
         float sNumber = getSecNumber();
         int sum = getSum();



         JOptionPane.showMessageDialog(null,sum);

    }
    public static Float getFNumber()
    {
        String firstnumAsString;
        float firstnum;


        firstnumAsString = JOptionPane.showInputDialog("please enter the first number:");
        firstnum = Float.parseFloat(firstnumAsString);
        return firstnum;

    }
    public static Float getSecNumber()
    {
        String secondnumAsString;
        float secondNum;

        secondnumAsString = JOptionPane.showInputDialog("Please enter the second number:");
        secondNum = Float.parseFloat(secondnumAsString);
        return secondNum;

    }
    public static int getSum()
    {
        String sumAsString;

        sumAsString = JOptionPane.showInputDialog("Please enter the sum you wish to make(a,s,m,d");


        int result;
        char sum = sumAsString.charAt(0);

        switch (sum){
            case 'a': result = +;
                break;
            case 's':  result = -;
                break;
            case 'm': result = *;
                break;
            case 'd': result = /;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid! not a valid sum");
        }


        return result;
    }
}
