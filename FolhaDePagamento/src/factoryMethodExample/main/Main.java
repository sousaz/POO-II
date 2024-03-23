package factoryMethodExample.main;

import factoryMethodExample.factory.LogisticFactory;
import factoryMethodExample.factory.SeaLogisticFactory;

public class Main {
    public static void main(String[] args) {



        LogisticFactory logistica = new SeaLogisticFactory();//new RoadLogisticFactory();

        logistica.doDelivery();


    }
}
