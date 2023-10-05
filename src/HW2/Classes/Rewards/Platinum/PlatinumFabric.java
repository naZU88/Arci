package HW2.Classes.Rewards.Platinum;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
