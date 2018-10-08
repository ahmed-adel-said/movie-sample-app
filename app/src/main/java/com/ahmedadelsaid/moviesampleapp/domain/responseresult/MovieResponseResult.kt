package com.ahmedadelsaid.moviesampleapp.domain.responseresult

import androidx.paging.PagedList
import com.ahmedadelsaid.moviesampleapp.domain.NetworkState
import com.ahmedadelsaid.moviesampleapp.domain.model.Movie

data class MovieResponseResult(
        val networkState: NetworkState,
        val movies: PagedList<Movie>? = null
)