import javax.swing.*;

public class ProblemSet0Exercise5 {
    public static void main(String[] args) {

        float total;

         char sum = getSum();
         float fNumber = getFNumber();
         float sNumber = getSecNumber();

         total = fNumber+sum+sNumber;

         JOptionPane.showMessageDialog(null,fNumber + sum + sNumber +" = " + total);

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
    public static char getSum()
    {
        String sumAsString;

        sumAsString = JOptionPane.showInputDialog("Please enter the sum you wish to make(a,s,m,d");

        char sum = 'a';

        switch (sum){
            case 'a': ;
                break;
            case 's': ;
                break;
            case 'm': ;
                break;
            case 'd': ;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid! not a valid sum");
        }
        sum = sumAsString.charAt(0);

        return sum;
    }
}
