package network;

import org.json.JSONObject;

/**
 * Created by Hendry on 11/10/2017.
 */

public interface JsonCallback {
    public void Done(JSONObject jsonObject, String message);
}
