package HW2.Classes.Rewards.Gem;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}