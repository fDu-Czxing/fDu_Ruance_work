package com.bytedance.hellofdu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.R
import android.app.Activity
import android.util.Log


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}


class MainActivity : Activity() {
    var msg = "Android : "

    /** 当活动第一次被创建时调用  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg, "The onCreate() event")
    }

    /** 当活动即将可见时调用  */
    override fun onStart() {
        super.onStart()
        Log.d(msg, "The onStart() event")
    }

    /** 当活动可见时调用  */
    override fun onResume() {
        super.onResume()
        Log.d(msg, "The onResume() event")
    }

    /** 当其他活动获得焦点时调用  */
    override fun onPause() {
        super.onPause()
        Log.d(msg, "The onPause() event")
    }

    /** 当活动不再可见时调用  */
    override fun onStop() {
        super.onStop()
        Log.d(msg, "The onStop() event")
    }

    /** 当活动将被销毁时调用  */
    public override fun onDestroy() {
        super.onDestroy()
        Log.d(msg, "The onDestroy() event")
    }
}