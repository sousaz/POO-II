package factoryMethodExample.factory;

import factoryMethodExample.entity.Transport;

public abstract class LogisticFactory {

    public void doDelivery() {
        Transport transport = createTransport();
        System.out.println("Iniciando processo de logística.");
        transport.deliver();
    }

    public abstract Transport createTransport();

}
