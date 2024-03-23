package factoryMethodExample.entity;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Fazendo entrega com caminhão.");
    }
}
