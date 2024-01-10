// Simple program to display a pop-up window that displays distributor information
// PepsiCo Advanced Software Engineering Program 
//
// Cole Dombrowski
//

import javax.swing.*;

public class DistributorPopup 
{
    public static void main(String[] args) 
    {
        // Create sample data (replace with actual data later)
        String distributorName = "Example Distributor";
        int quantityShippedLastMonth = 100;
        int forecastedQuantity = 120;
        int yearToDateAverage = 110;

        // Create a StringBuilder to construct the message
        StringBuilder message = new StringBuilder();
        message.append("Distributor: ").append(distributorName).append("\n");
        message.append("Quantity Shipped Last Month: ").append(quantityShippedLastMonth).append("\n");
        message.append("Forecasted Quantity: ").append(forecastedQuantity).append("\n");
        message.append("Year-to-Date Average: ").append(yearToDateAverage);

        // Create a JOptionPane to display the information in a pop-up window
        JOptionPane.showMessageDialog(null, message.toString(), "Distributor Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
