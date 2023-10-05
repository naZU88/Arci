package HW2.Classes.Rewards.Gold;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
