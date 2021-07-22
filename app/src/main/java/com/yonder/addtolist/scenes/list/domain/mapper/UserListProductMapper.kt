package com.yonder.addtolist.scenes.list.domain.mapper

import com.yonder.addtolist.core.extensions.toInt
import com.yonder.addtolist.core.mapper.Mapper
import com.yonder.addtolist.local.entity.UserListProductEntity
import com.yonder.addtolist.scenes.list.data.remote.response.UserListProductResponse

/**
 * @author yusuf.onder
 * Created on 20.07.2021
 */

class UserListProductMapper constructor(
  private val listUUID: String
) : Mapper<UserListProductResponse?, UserListProductEntity> {

  override fun map(input: UserListProductResponse?): UserListProductEntity {
    return UserListProductEntity(
      listUUID = listUUID,
      id = input?.id,
      name = input?.name,
      categoryImage = input?.categoryImage,
      categoryName = input?.categoryName,
      note = input?.note,
      unit = input?.unit,
      done = input?.done.toInt(),
      favorite = input?.favorite.toInt(),
      quantity = input?.quantity,
      price = input?.price,
      sync = true
    )
  }
}
