package com.example.aplicacionargentinaprograma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.aplicacionargentinaprograma.databinding.ActivityMainBinding

// MainActivity.kt
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var videoPlayerManager: VideoPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        videoPlayerManager = VideoPlayerManager(this)

        setupUI()
    }

    private fun setupUI() {
        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString().replace("\\s+".toRegex(), "")
            val text2 = binding.editText2.text.toString().replace("\\s+".toRegex(), "")
            viewModel.compareStrings(text1, text2)
        }

        viewModel.comparisonResult.observe(this, { result ->
            binding.resultTextView.text = "Resultado: $result"
        })

        videoPlayerManager.initVideoPlayer(binding.videoView)
    }
}


