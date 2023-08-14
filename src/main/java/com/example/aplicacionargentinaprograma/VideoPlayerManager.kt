package com.example.aplicacionargentinaprograma

import android.content.Context
import android.widget.VideoView
import android.widget.MediaController

class VideoPlayerManager(private val context: Context) {
    fun initVideoPlayer(videoView: VideoView) {
        val mediaController = MediaController(context)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val videoPath = "android.resource://" + context.packageName + "/" + R.raw.video1
        videoView.setVideoPath(videoPath)
        videoView.start()
    }
}