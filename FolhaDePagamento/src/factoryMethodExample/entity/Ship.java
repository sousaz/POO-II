package factoryMethodExample.entity;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Fazend entrega por navio.");
    }

}
