/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.networkinformation;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.util.Locale;

public class NetworkTurn extends CordovaPlugin {

    /**
     * Executes the request.
     *
     * @param action The action to execute.
     * @param args The exec() arguments.
     * @param callback The callback context used when calling back into
     * JavaScript.
     * @return Returning false results in a "MethodNotFound" error.
     *
     * @throws JSONException
     */
    @Override
    public boolean execute(String action, JSONArray args,
            CallbackContext callback) throws JSONException {

        if ( action.equalsIgnoreCase("wifi") ) {            
            return "wifi-true";
        } else if ( action.equalsIgnoreCase("3G") ) {
            return "3G-true";
        }
        return false;
    }
}
