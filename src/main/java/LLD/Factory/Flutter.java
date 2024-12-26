package LLD.Factory;

public class Flutter {
    public void refreshUi(){
        System.out.println("Refreshing UI");
    }

    public void setTheme(){
        System.out.println("Setting theme...");
    }

    public UIFactory getUIFactory(Platform platform){
        return  UIFactoryFactory.getUIFactory(platform);
    }
}
