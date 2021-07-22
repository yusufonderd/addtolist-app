package com.yonder.addtolist.scenes.detail.domain

import com.yonder.addtolist.scenes.detail.domain.category.CategoryListRepository
import com.yonder.addtolist.scenes.detail.domain.category.CategoryListRepositoryImpl
import com.yonder.addtolist.scenes.detail.domain.category.CategoryListUseCase
import com.yonder.addtolist.scenes.detail.domain.category.CategoryListUseCaseImpl
import com.yonder.addtolist.scenes.detail.domain.product.AddProductUseCase
import com.yonder.addtolist.scenes.detail.domain.product.AddProductUseCaseImpl
import com.yonder.addtolist.scenes.detail.domain.product.ProductRepository
import com.yonder.addtolist.scenes.detail.domain.product.ProductRepositoryImpl
import com.yonder.addtolist.scenes.list.data.local.datasource.CategoryDataSource
import com.yonder.addtolist.scenes.list.data.local.datasource.CategoryDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
/**
 * @author yusuf.onder
 * Created on 19.07.2021
 */

@[Module InstallIn(ViewModelComponent::class)]
interface ListDetailModule {

  @get:[Binds]
  val CategoryListUseCaseImpl.useCase: CategoryListUseCase

  @get:[Binds]
  val CategoryListRepositoryImpl.repository: CategoryListRepository

  @get:[Binds]
  val CategoryDataSourceImpl.dataSource: CategoryDataSource

  @get:[Binds]
  val ProductRepositoryImpl.productRepository: ProductRepository

  @get:[Binds]
  val AddProductUseCaseImpl.addProductUseCase: AddProductUseCase

}