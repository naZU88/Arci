package HW4;

import java.util.List;

public class Customer {

    public int id;
    public CashProvider Cash;
    public List<Ticket> tickets;

    public boolean buyTicket(Ticket ticket) {
        //покупка билета успешно -вернет true
    }

    public void searchTicket(dateTime date, int rootNumber) {

    }

    public boolean reserveTicket(Ticket ticket) {

        // если isValid true ставит бронь
    }

    public long getNumberCard() {
        return 0;
    }
}
