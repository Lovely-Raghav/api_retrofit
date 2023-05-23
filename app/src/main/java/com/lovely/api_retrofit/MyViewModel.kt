package com.lovely.api_retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lovely.api_retrofit.AlbumActivity.Album

class MyViewModel:ViewModel(){
    private lateinit var album: MutableLiveData<Album>
    fun getAlbums():LiveData<Album>{

    }
    }
