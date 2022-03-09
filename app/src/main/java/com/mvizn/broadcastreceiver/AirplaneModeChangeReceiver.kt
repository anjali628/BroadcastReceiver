package com.mvizn.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isOn=intent?.getBooleanExtra("state",false)
        if(isOn==true)
        {
            Toast.makeText(context,"Active",Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(context,"Airplane Mode Off",Toast.LENGTH_SHORT).show()

        }

    }
}