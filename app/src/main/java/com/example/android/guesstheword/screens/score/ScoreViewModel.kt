package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**     Code with ❤
╔════════════════════════════╗
║   Created by Seyfi ERCAN   ║
╠════════════════════════════╣
║  seyfiercan35@hotmail.com  ║
╠════════════════════════════╣
║      17,March,2021      ║
╚════════════════════════════╝
 */
class ScoreViewModel(finalScore: Int) : ViewModel() {
    // The final score
    private val _score = MutableLiveData<String>()
    val score: LiveData<String>
        get() = _score

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain


    init {
        _score.value=finalScore.toString()
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }
    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}