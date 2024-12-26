package LLD.Factory;

import LLD.Factory.components.Button.Button;
import LLD.Factory.components.Button.WindowsButton;
import LLD.Factory.components.Menu.Menu;
import LLD.Factory.components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
