package com.song.sunset.utils

import android.util.Log
import com.song.sunset.interfaces.IOrigin

/**
 * @author songmingwen
 * @description
 * @since 2019/3/5
 */
class OriginImpl : IOrigin {

    override fun originMethod() {
        Log.e(this.javaClass.toString(), "原始方法")
    }

}