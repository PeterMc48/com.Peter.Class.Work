import javax.swing.*;

public class ProblemSet0Exercise1 {
    public static void main(String[] args) {
        String name, YourClass, snacksAsString;
        int snacks, total;

        name = getName();
        YourClass = getYear();
        snacksAsString = getAmount();
        total = getTotal(snacksAsString);

        JOptionPane.showMessageDialog(null, "Your Name: " + name +
                "\nYour in " + YourClass + " Year" +
                "\nYou Brought " + snacksAsString + "Snacks" +
                "\nTotal Cost " + total + "euro");
    }

    public static String getName() {

        return JOptionPane.showInputDialog("Please enter your Name?");
    }
    public static String getYear() {

        return JOptionPane.showInputDialog("Please enter the Year you are in?");
    }
    public static String getAmount(){

        return JOptionPane.showInputDialog("How many mineral and muffin snacks would you like?");

    }
    public static int getTotal(String s){

        int snacks = Integer.parseInt(s);

        return snacks * 2;

    }


}
