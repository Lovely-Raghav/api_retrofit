package com.lovely.api_retrofit

import androidx.lifecycle.MutableLiveData
import com.lovely.api_retrofit.AlbumActivity.Album
import retrofit2.Call
import retrofit2.Response

class AlbumRepository {
    private var albums= MutableLiveData<Album>()
    fun callAlbumApi() : MutableLiveData<Album> {
        val call = RetrofitAlbemClient.placeHolderInterface.getAlbums()
        call.enqueue(object :retrofit2.Callback<Album>{
            override fun onResponse(call: Call<Album>, response: Response<Album>) {
              albums.value=response.body()
            }

            override fun onFailure(call: Call<Album>, t: Throwable) {

            }
        })
        return albums
    }

}