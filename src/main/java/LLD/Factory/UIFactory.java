package LLD.Factory;

import LLD.Factory.components.Button.Button;
import LLD.Factory.components.Menu.Menu;

public interface UIFactory {

    public Button createButton();

    public Menu createMenu();

}
