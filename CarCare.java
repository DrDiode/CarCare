// Car Care Application - Exercise 3 (Page 409)

import javax.swing.JOptionPane;

public class CarCare
{
    public static void main(String[] args)
    {
        // Variables and constants
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        double[] prices = {25.00, 22.00, 15.00, 5.00};
        int matchIndex = 0;
        boolean isMatch = false;
        int keepTrying = 0;
        String selection = "";

        // Do...while loop

        do
        {
            // Input phase
            selection = JOptionPane.showInputDialog(null, "Please type the name of a service to see it's price: \noil change \ntire rotation \nbattery check \nbrake inspection");

            // loop through all the services looking for a match
            for(int x = 0; x < services.length; x++)
            {
                // Check to see if we have a match
                if(selection.substring(0, 3).equalsIgnoreCase(services[x].substring(0, 3)))
                {
                    // Match has been found!
                    isMatch = true;
                    matchIndex = x;
                    JOptionPane.showMessageDialog(null, "You selected: " + services[matchIndex] + "\nThe price for that service  is: $" + prices[matchIndex]);
                    // Early exit if needed
                    x = services.length;
                }
                else
                {
                    // Match not found!
                    ++keepTrying;
                    if(keepTrying == services.length)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry, no selectionfound!!");
                    }
                }
            }
        }
        while(isMatch == false);

    }
}