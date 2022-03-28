package com.vina.kotlinmovieapp.services

import com.vina.kotlinmovieapp.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=ba71e8a37862cbfe2bc1bec90faf78b2")
    fun getMovieList(): retrofit2.Call<MovieResponse>
}