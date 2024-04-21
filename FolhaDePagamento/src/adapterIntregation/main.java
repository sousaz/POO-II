package adapterIntregation;

import adapterIntregation.adapters.XMLtoJsonAdapter;
import adapterIntregation.devices.empresaABC.SistemaABC;
import adapterIntregation.devices.tanakara.FornecedorX;
import adapterIntregation.devices.xingling.FornecedorA;
import tvPort.adapters.HDMIToVGAAdapter;
import tvPort.devices.Computer;
import tvPort.devices.OldMonitor;
import tvPort.devices.TV;

public class main {
    public static void main(String[] args) {
        System.out.println("Fornecedor A");
        SistemaABC abc = new SistemaABC();
        FornecedorA a = new FornecedorA();
        abc.receiveData(a);


        System.out.println("Fornecedor X");
        SistemaABC abc2 = new SistemaABC();
        FornecedorX x = new FornecedorX();
        abc2.receiveData(new XMLtoJsonAdapter(x));
    }
}
