package com.litekite.ime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "HeatTalk"
    }

    init {
        if (Log.isLoggable(TAG, Log.VERBOSE)) {
            Log.v(TAG, "初始化")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Log.isLoggable(TAG, Log.VERBOSE)) {
            Log.v(TAG, "开始onCreate")
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        if (Log.isLoggable(TAG, Log.VERBOSE)) {
            Log.v(TAG, "onCreate完成")
        }
        
        // 错误日志通常总是需要显示的
        Log.e(TAG, "测试错误日志")
    }
} 