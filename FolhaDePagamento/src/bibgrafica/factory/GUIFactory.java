package bibgrafica.factory;

import bibgrafica.entity.Button;
import bibgrafica.entity.Checkbox;





public interface GUIFactory {	
	Button createButton();
	Checkbox createCheckbox();
}
