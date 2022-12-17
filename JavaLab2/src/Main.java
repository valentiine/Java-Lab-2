import java.time.LocalDate;

// Name : Valentine Sah
// Student ID : 100757000
// Date : Nov 20th 2022
// File name : Main.java

public class Main
{
    public static void main(String[] args)
    {
        // Create array
        WorkTicket[] workTickets = new WorkTicket[3];

        // Create and add Work Tickets into the array
        workTickets[0] = new WorkTicket();
        workTickets[0].setWorkTicket(1, "A300", LocalDate.of(2020, 6, 5), "Computer is broken");

        workTickets[1] = new WorkTicket();
        workTickets[1].setWorkTicket(2, "B300", LocalDate.of(2021, 7, 16), "Lost my keys");

        workTickets[2] = new WorkTicket();
        workTickets[2].setWorkTicket(3, "C300", LocalDate.of(2022, 8, 21), "Laptop is broken");

        // For loop to display Work Tickets
        for (WorkTicket workTicket : workTickets)
        {
            System.out.println(workTicket);
            System.out.println("\n");
        }
    }
}
