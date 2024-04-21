package adapterIntregation.adapters;

import adapterIntregation.interfaces.JSON;
import adapterIntregation.interfaces.XML;

public class XMLtoJsonAdapter implements JSON {
    private XML file;

    public XMLtoJsonAdapter(XML xml){
        System.out.println("Converting the XML to JSON...");
        this.file = xml;
    }


    @Override
    public void setFile(String file) {
        System.out.println(file);
    }
}
