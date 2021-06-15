/*
 * Copyright 2021 LiteKite Startup. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.litekite.ime.app

import android.app.Application
import android.util.Log

/**
 * @author Vignesh S
 * @version 1.0, 01/06/2021
 * @since 1.0
 */
class ImeApp : Application() {

    companion object {

        val TAG: String = ImeApp::class.java.simpleName

        /**
         * Logs messages for Debugging Purposes.
         *
         * @param tag     TAG is a class name in which the log come from.
         * @param message Type of a Log Message.
         */
        fun printLog(tag: String, message: String) {
            Log.d(tag, message)
        }
    }

    override fun onCreate() {
        super.onCreate()
        printLog(TAG, "onCreate:")
    }

    override fun onTerminate() {
        super.onTerminate()
        printLog(TAG, "onTerminate:")
    }
}