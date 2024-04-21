package bibgrafica.factory;

import bibgrafica.entity.Button;
import bibgrafica.entity.Checkbox;
import bibgrafica.entity.MacOSButton;
import bibgrafica.entity.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {		
		return new MacOSCheckbox();
	}

}
