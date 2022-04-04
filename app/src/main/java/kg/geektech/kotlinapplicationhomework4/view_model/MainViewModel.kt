package kg.geektech.kotlinapplicationhomework4.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class MainViewModel : ViewModel() {
    private var mHistory = "0"
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val historyList = MutableLiveData<String>()

    fun onIncrementClick() {
        mCounter++
        mHistory = "+"
        historyList.postValue(mHistory)
        counter.value = mCounter
    }

    fun onDecrementClick() {
        mCounter--
        mHistory = "-"
        historyList.postValue(mHistory)
        counter.value = mCounter
    }

    fun justStart() {
        historyList.postValue(mHistory)
        counter.value = mCounter
    }
}