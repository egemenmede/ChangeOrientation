package com.dp.plugin.changeorientation;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;

import android.content.pm.ActivityInfo;

public class ChangeOrientationPlugin extends CordovaPlugin { 
	public static final String NATIVE_ACTION_STRING="changeOrientation"; 
	public static final String ORIENTATION_PARAMETER="portrait";
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) { 
        try {
        	if (NATIVE_ACTION_STRING.equals(action)) { 
        		if (ORIENTATION_PARAMETER.equals(args.getString(0))) { 
        			this.cordova.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        			callbackContext.success();
        		}else{
        			this.cordova.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        			callbackContext.success();
        		}
        		return true;
            }else{
            	callbackContext.error("Bir hata olustu!");
            	return false;
            }
        } catch(Exception e) {
            callbackContext.error(e.getMessage());
            return false;
        }
        
	}

}
