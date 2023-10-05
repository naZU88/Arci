package HW2.Classes.Rewards.Bronze;

import HW2.Classes.IGameItem;
import HW2.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }


}