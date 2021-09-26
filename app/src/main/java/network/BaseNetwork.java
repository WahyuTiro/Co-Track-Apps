package network;

import android.content.Context;

/**
 * Created by Hendry on 11/10/2017.
 */

public class BaseNetwork {
    protected ConnectionHandler connectionHandler;
    protected Context context;
    public BaseNetwork(Context context){
        connectionHandler = new ConnectionHandler(context);
    }
}
