import javax.swing.*;

public class ProblemSet0Exercise2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your first name, initial and last name?");
        String Distance = JOptionPane.showInputDialog("how many km did you travel?");

        float km = Float.parseFloat(Distance);


        JOptionPane.showMessageDialog(null, "Name: " + name +
                "\n Distance Travel: " + Distance +"KM"+
                "\nMoney Due: "+ String.format("%.2f",calc(km)) +"euro");

    }
    public static float calc(float km) {

        float rate=0, total;
        String rateAsString;

        if (km <= 10) {
            rate = km * .07f;
        } else if (km > 10) {
            rate = ((km * .10f) - 1f) + .70f;
        }
            //rateAsString = String.format("%.2f",rate);

            return rate;

    }
}
