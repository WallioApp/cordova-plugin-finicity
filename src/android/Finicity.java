package com.wallio.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import com.finicity.connect.sdk.Connect;
import com.wallio.cordova.plugin.FinicityEventHandler;

public class Finicity extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

      if (action.equals("connect")) {
      FinicityEventHandler handler = new FinicityEventHandler(callbackContext);

      Context context = this.cordova.getActivity();
      Connect.start(context, args.getString(0), handler);

      return true;
    }

    return false;
  }
}