package LLD.Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(Platform platform) {
        if(platform.equals(Platform.IOS)){
            return new IOSUIFactory();
        } else if (platform.equals(Platform.WINDOWS)) {
            return new WindowsUIFactory();
        }

        return null;
    }
}
