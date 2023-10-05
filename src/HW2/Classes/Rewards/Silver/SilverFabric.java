package HW2.Classes.Rewards.Silver;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
