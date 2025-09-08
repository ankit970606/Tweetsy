package com.example.tweetsy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.repo.TweetRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Locale
import javax.inject.Inject


@HiltViewModel
class CategoryViewModel @Inject constructor(private val repository: TweetRepo): ViewModel() {

    val categories: StateFlow<List<String>>
        get() = repository.categroies

    init {
        viewModelScope.launch {
            repository.getCategories()
        }
    }
}