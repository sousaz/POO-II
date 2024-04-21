package adapterIntregation.devices.tanakara;

import adapterIntregation.interfaces.XML;

// envia XML
public class FornecedorX implements XML {
    @Override
    public void setFile(String file){
        System.out.println("This is your XML: " + file);
    }
}
