import javax.swing.*;

public class ProblemSet0Exercise5 {
    public static void main(String[] args) {




         float fNumber = getFNumber();
         float sNumber = getSecNumber();
         double sum = getSum(fNumber,sNumber);



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
    public static double getSum(float f,float s)
    {
        String sumAsString;

        sumAsString = JOptionPane.showInputDialog("Please enter the sum you wish to make(a,s,m,d");


        double result = 0;
        char sum = sumAsString.charAt(0);

        switch (sum){
            case 'a': result = f + s;
                break;
            case 's':  result = f - s;
                break;
            case 'm': result = f * s;
                break;
            case 'd': result = f / s;
                break;
            default:
                 JOptionPane.showMessageDialog(null,"Invalid! not a valid sum");
        }


        return result;
    }
}
