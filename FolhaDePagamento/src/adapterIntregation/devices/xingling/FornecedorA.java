package adapterIntregation.devices.xingling;

import adapterIntregation.interfaces.JSON;

// envia JSON
public class FornecedorA implements JSON {
    @Override
    public void setFile(String file){
        System.out.println("This is your JSON: " + file);
    }
}
