package LLD.Factory;

import LLD.Factory.components.Button.Button;
import LLD.Factory.components.Button.IOSButton;
import LLD.Factory.components.Menu.IOSMenu;
import LLD.Factory.components.Menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
