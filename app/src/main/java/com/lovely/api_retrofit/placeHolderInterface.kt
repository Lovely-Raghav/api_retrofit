package com.lovely.api_retrofit

import com.lovely.api_retrofit.AlbumActivity.Album
import retrofit2.Call
import retrofit2.http.GET

interface placeHolderInterface {
    @GET("/albums")
    fun getAlbums() : Call<Album>
}