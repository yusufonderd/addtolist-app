package com.yonder.addtolist.scenes.home.domain.usecase

import com.yonder.addtolist.local.AppDatabase
import com.yonder.addtolist.local.entity.UserListProductEntity
import javax.inject.Inject

/**
 * @author yusuf.onder
 * Created on 29.08.2021
 */

interface GetUserListProductUseCase {
  suspend operator fun invoke(listUUID: String, productName: String): UserListProductEntity?
}

class GetUserListProductUseCaseImpl @Inject constructor(
  private val appDatabase: AppDatabase
) : GetUserListProductUseCase {
  override suspend fun invoke(listUUID: String, productName: String): UserListProductEntity? {
    return appDatabase.userListProductDao().findByListUUID(listUUID, productName)
  }

}
