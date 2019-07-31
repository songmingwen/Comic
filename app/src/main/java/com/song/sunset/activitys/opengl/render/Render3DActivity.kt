package com.song.sunset.activitys.opengl.render

import com.song.sunset.activitys.opengl.BaseRenderActivity
import com.song.sunset.widget.opengl.render.GLRender3D
import com.song.sunset.widget.opengl.surfaceview.BaseGLSurfaceView

class Render3DActivity : BaseRenderActivity() {

    override fun getGLSurfaceView(): BaseGLSurfaceView {
        return object : BaseGLSurfaceView(this) {
            override fun getRender(): Renderer {
                return GLRender3D(context)
            }
        }
    }
}
