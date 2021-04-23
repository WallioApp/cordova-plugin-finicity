package com.wallio.cordova.plugin;

import com.finicity.connect.sdk.EventHandler;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

public class FinicityEventHandler implements EventHandler {
  CallbackContext _callbackContext;

  public FinicityEventHandler(CallbackContext callbackContext) {
    _callbackContext = callbackContext;
  }

  @Override
  public void onLoaded() {
  }

  @Override
  public void onDone(JSONObject doneEvent) {
    _callbackContext.success("onDone");
  }

  @Override
  public void onCancel() {
    _callbackContext.error("onCancel");
  }

  @Override
  public void onError(JSONObject errorEvent) {
    _callbackContext.error("onError");
  }

  @Override
  public void onRouteEvent(JSONObject routeEvent) {
  }

  @Override
  public void onUserEvent(JSONObject userEvent) {
  }
}
