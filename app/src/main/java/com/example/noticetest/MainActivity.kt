package com.example.noticetest

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val channelId = "channel_id"
        val channelName = "channel_name"

        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(channelId,channelName,importance).apply {
            description = "channel_Description"
        }
        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)

        val builder = NotificationCompat.Builder(this,channelId)
            .setSmallIcon(R.drawable.icon)
            .setContentTitle("Notification test")
            .setContentText("This is test")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        val PROGRESS_MAX = 100
        val PROGRESS_CURRENT = 0

        var notificationId = 0
        btNt.setOnClickListener{
            with(NotificationManagerCompat.from(this)){
                notify(notificationId,builder.build())
                notificationId += 1
            }
        }
    }

}