import java.time.LocalDate;

// Name : Valentine Sah
// Student ID : 100757000
// Date : Nov 20th 2022
// File name : WorkTicket.java

public class WorkTicket
{
    private int workTicketNumber;
    private String clientID;
    private LocalDate workTicketDate;
    private String issueDescription;

    // Default constructor
    public WorkTicket()
    {
        workTicketNumber = 0;
        clientID = null;
        workTicketDate = null;
        issueDescription = null;
    }

    // Parameterized constructor
    public WorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription)
    {
        setWorkTicket(workTicketNumber, clientID, workTicketDate, issueDescription);
    }

    // Setter method for all attributes
    public void setWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription)
    {
        // Validate work ticket number
        if (workTicketNumber <= 0)
        {
            throw new IllegalArgumentException("Work ticket number must be a positive number");
        }

        // Validate work ticket date
        if (workTicketDate.getYear() < 2000 || workTicketDate.getYear() > 2099)
        {
            throw new IllegalArgumentException("Work ticket year must be between 2000 and 2099");
        }

        // Validate client ID and issue description
        if (clientID.length() < 1 || issueDescription.length() < 1)
        {
            return;
        }

        this.workTicketNumber = workTicketNumber;
        this.clientID = clientID;
        this.workTicketDate = workTicketDate;
        this.issueDescription = issueDescription;

    }

    // Override toString() method
    @Override
    public String toString()
    {
        return "WorkTicket : \n" +
                "  Work Ticket Number = " + workTicketNumber + "\n" +
                "  Client ID = " + clientID + "\n" +
                "  Work Ticket Date (YYYY-MM-DD) = " + workTicketDate + "\n" +
                "  Issue Description = " + issueDescription;
    }

}
