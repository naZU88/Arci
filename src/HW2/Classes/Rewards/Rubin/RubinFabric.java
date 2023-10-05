package HW2.Classes.Rewards.Rubin;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class RubinFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Rubin();
    }
}
