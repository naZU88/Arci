package HW2.Classes.Rewards.Gold;

import HW2.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}
