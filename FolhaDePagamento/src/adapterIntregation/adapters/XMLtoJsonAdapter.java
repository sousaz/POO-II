package adapterIntregation.adapters;

import adapterIntregation.interfaces.JSON;
import adapterIntregation.interfaces.XML;

public class XMLtoJsonAdapter implements JSON {
    private XML file;

    public XMLtoJsonAdapter(XML xml){
        System.out.println("Connecting the XML/JSON adapter...");
        this.xml = xml;
    }


    @Override
    public void setFile(String arquivo) {
        System.out.println("Converting the XML to JSON");
        file.setFile(arquivo);
    }
}
