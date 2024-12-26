package LLD.Factory;

import LLD.Factory.components.Button.Button;
import LLD.Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.WINDOWS);

        Button button = uiFactory.createButton();
        button.displayButton();

        Menu menu = uiFactory.createMenu();
        menu.displayMenu();


    }
}
