package com.example.tweetsy.api

import com.example.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("b/68bd42a943b1c97be939c80e?meta=false")
   suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<TweetListItem>>

   @GET("b/68bd42a943b1c97be939c80e?meta=false")
   @Headers("""X-JSON-Path: $[*].category""")
   suspend fun getCategories(): Response<List<String>>
}