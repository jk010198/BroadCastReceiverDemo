package com.infotechworld.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.infotechworld.broadcastreceiverdemo.utils.NetworkUtil


class MyBroadcast : BroadcastReceiver() {
    override fun onReceive(c: Context, intent: Intent?) {
        val status = NetworkUtil().getConnectivityStatusString(c)

        Toast.makeText(c, status, Toast.LENGTH_LONG).show()
//        when (intent?.action) {
//            //Intent.ACTION_
//        }
    }
}