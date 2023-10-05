package HW2.Classes.Rewards.Suphire;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class SaphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Saphire();
    }
}