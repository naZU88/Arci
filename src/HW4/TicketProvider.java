package HW4;

import java.util.List;

public class TicketProvider {
    public List<Ticket> getTickets(int routeNumber) {
        return ticketRepo.readAll(routeNumber);
    }
    public boolean updateTickets(Ticket ticket) {
        ticket.setValid(false);
        return ticketRepo.update(ticket);
    }
}