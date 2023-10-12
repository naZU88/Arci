package HW4;

import java.lang.ScopedValue.Carrier;

public class CashProvider {
    private long numberCard;
    private boolean isAuthorized = false;
    private double balanceCard;

    public boolean buy(Ticket ticket) {
        if (isAuthorized) {
            //покупка
        }
        return false;
    }

    public void authorization(Customer client) {
        numberCard = client.getNumberCard();
        isAuthorized = true;
    }

    public boolean isEnouthCash(double balanceCard, int price)
        //проверка остатка на карте - если баланс > цены билета - true
    }


}
