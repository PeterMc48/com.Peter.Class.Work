import javax.swing.*;

public class ProblemSet0Exercise3 {

    public static void main(String[] args) {

        String name, grossAsString;
        float gross,taxRate, taxDue;

        name = getName();
        grossAsString = getGross();
        gross = getTax(grossAsString);
        taxRate = getTaxRate(grossAsString);
        taxDue = getTaxDue(grossAsString);

        JOptionPane.showMessageDialog(null,"Name: "+name+
                                                                "\nGross: "+grossAsString+
                                                                "\nTax Rate: "+taxRate+
                                                                "\nTax Due: "+taxDue+
                                                                "\nAfter Tax: "+gross);

    }
    public static String getName()
    {
       return JOptionPane.showInputDialog("Please enter Your name?");
    }
    public static String getGross(){
       return JOptionPane.showInputDialog("Please enter Your Gross Income?");
    }
    public static float getTax(String g) {
        float gross, tax;

        gross = Float.parseFloat(g);

        if (gross <= 20000)
        {
            return gross;
        }
        else if (gross <= 36000)
        {
            tax = gross - (gross * .2f);
            return tax;
        }
        else
            tax = gross - (gross * .41f);
            return tax;

    }
    public static int getTaxRate(String g) {
        int gross;

        gross = Integer.parseInt(g);

        if (gross <= 20000)
        {
            return 0;
        }
        else if (gross <=36000)
        {
            return 20;
        }
        else

            return 41;

    }
    public static float getTaxDue(String g) {
        float gross;

        gross = Float.parseFloat(g);

        if (gross <= 20000)
        {
            return 0;
        }
        else if (gross <= 36000)
        {
            return gross * .2f;
        }
        else

            return gross * .41f;

    }
}
