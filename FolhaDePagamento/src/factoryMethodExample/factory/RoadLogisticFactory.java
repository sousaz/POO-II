package factoryMethodExample.factory;

import factoryMethodExample.entity.Transport;
import factoryMethodExample.entity.Truck;

public class RoadLogisticFactory extends LogisticFactory {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
