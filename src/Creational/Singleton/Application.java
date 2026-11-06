package Creational.Singleton;

class ConfigurationManager{
    private static ConfigurationManager instance;

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance() {
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }
}