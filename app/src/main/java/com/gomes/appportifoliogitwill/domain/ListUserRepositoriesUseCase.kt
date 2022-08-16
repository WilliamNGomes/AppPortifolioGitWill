package com.gomes.appportifoliogitwill.domain

import androidx.camera.core.UseCase
import com.gomes.appportifoliogitwill.data.model.Repo
import com.gomes.appportifoliogitwill.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}