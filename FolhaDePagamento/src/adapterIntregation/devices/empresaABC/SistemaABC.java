package adapterIntregation.devices.empresaABC;

import adapterIntregation.interfaces.JSON;

public class SistemaABC {
    private JSON file;
    public void receiveData(JSON file){
        System.out.println("Recebendo arquivo JSON");
        this.file = file;
    }
}
