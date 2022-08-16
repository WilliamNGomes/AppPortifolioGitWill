package com.gomes.appportifoliogitwill.data.repositories

import com.gomes.appportifoliogitwill.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}