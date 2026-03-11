package com.aentrena.androidcompose.data

import com.aentrena.androidcompose.data.local.LocalDataSource
import com.aentrena.androidcompose.data.network.NetworkDataSourceImpl
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val networkDataSourceImpl: NetworkDataSourceImpl
): Repository {
}