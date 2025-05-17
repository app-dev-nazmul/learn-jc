package com.example.learnjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.learnjc.data.SurahViewModel
import com.example.learnjc.ui.theme.LearnJCTheme
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnJCTheme {
                val viewModel: SurahViewModel = getViewModel()
                val surahList by viewModel.readAllSurah.collectAsState(initial = emptyList())

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    if (surahList.isEmpty()) {
                        Column(modifier = Modifier.padding(innerPadding)) {
                            Text(text = "Loading...")
                        }
                    } else {
                        LazyColumn(modifier = Modifier.padding(innerPadding)) {
                            items(surahList) { surah ->
                                Text(text = surah.name.toString())
                            }
                        }
                    }
                }
            }
        }
    }
}