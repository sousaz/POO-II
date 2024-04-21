package bibgrafica.factory;

import bibgrafica.entity.Button;
import bibgrafica.entity.Checkbox;
import bibgrafica.entity.WindowsButton;
import bibgrafica.entity.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
