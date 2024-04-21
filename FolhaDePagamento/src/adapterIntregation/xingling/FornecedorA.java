package adapterIntregation.xingling;

import adapterIntregation.interfaces.JSON;

// envia JSON
public class FornecedorA {
    private JSON file;

    public FornecedorA(JSON file) {
        this.file = file;
    }

    public void sendJSON(){
        System.out.println("Sending JSON...");
    }
}
