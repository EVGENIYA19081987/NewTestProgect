package providers;

import java.util.ResourceBundle;

public class DataProviders {


    public static final String URL=getValue("url");
    public static final String LOGIN=getValue("login");
    public static final String PASSWORD=getValue("password");

    private static final String APPLICATION="application";

    public static String getValue(String key){
        return ResourceBundle.getBundle(DataProviders.APPLICATION).getString(key);

    }

}
