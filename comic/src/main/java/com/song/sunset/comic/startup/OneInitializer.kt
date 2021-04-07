package com.song.sunset.comic.startup

import android.content.Context
import androidx.startup.Initializer
import com.song.sunset.comic.startup.base.BaseInitializer
import com.song.sunset.comic.startup.task.OneStartUp

/**
 * Desc:
 * Author:  songmingwen
 * Email:   mingwen@mgtv.com
 * Time:    2021/4/7 16:49
 */
class OneInitializer : BaseInitializer<OneStartUp>() {

    override fun createInitializer(context: Context): OneStartUp {
        OneStartUp.getInstance().init(context)
        return OneStartUp.getInstance()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}