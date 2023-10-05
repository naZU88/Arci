package HW2.Classes.Rewards.Silver;

import HW2.Classes.IGameItem;

public class Silver implements IGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }
}