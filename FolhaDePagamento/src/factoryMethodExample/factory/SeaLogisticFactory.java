package factoryMethodExample.factory;

import factoryMethodExample.entity.Transport;
import factoryMethodExample.entity.Ship;

public class SeaLogisticFactory extends LogisticFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
