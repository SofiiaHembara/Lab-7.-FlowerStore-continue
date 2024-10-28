package flowercontinue.flowercontinue.delivery;

import flowercontinue.flowercontinue.model.Item;
import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
