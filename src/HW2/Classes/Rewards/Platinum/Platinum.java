package HW2.Classes.Rewards.Platinum;

import HW2.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}