import com.github.dreamhead.moco.RestServer;
import com.github.dreamhead.moco.Runner;

import static com.github.dreamhead.moco.Moco.log;
import static com.github.dreamhead.moco.MocoRest.restServer;

/**
 * Created by davkas on 2016/9/26.
 */
public class App {

    private Runner runner;

    private static int port = 100;

    public static void main(String[] args) {
        RestServer server = restServer(port, log());

    }


}
