package bibgrafica.main;

import bibgrafica.factory.GUIFactory;
import bibgrafica.factory.MacOSFactory;
import bibgrafica.factory.WindowsFactory;

public class Main {
	
	public static void main(String[] args) {
		GUIFactory factory = null;
		
		String SO = System.getProperty("os.name").toLowerCase();
		
		if (SO.contains("windows"))
			factory = new WindowsFactory();
		else
		if (SO.equals("mac"))
			factory = new MacOSFactory();
		
		
		Application app = new Application(factory);
		
		app.paint();
	}

}
