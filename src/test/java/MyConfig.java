import java.util.Random;

public class MyConfig {

    public static final String myProjectAPIToken = "17b35e5e964544dabc7e41884f1531a2";
    public static final String myTestEnv = Utils.changeEnv();


    public static final String myToken = "17b35e5e964544dabc7e41884f1531a2"; //   use <post_server_item> token for your rollbar project
    public static final String myENv =  Utils.changeEnv();
    public static final String myVersion = RollbarUtils.randomString(10);
    public static final String framework = "Junit5";
    public static final String platform = "macOS";

    // Server Provider info
    public static final String myRoot = "com.IanFlanagan";
    public static final String myHost = "Ians-MacBook-Pro.local"; // old localhost new Utils.GetHostName(); Ians-MacBook-Pro.local
    public static final String myBranch = "main";

    public static final String RBItemsURL = "https://api.rollbar.com/api/1/items";

}


