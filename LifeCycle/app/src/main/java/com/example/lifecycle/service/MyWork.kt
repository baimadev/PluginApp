package com.example.lifecycle.service

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import timber.log.Timber
import java.util.*

class MyWork(ctx:Context,params:WorkerParameters):Worker(ctx,params) {
    override fun doWork(): Result {

        return try {
            val str=inputData.getString("xia")
          Timber.v(str)
            Log.e("xia","a")
            Result.success()
        }catch (throwable:Throwable){
            Timber.e(throwable)
            Result.failure()
        }


    }
}