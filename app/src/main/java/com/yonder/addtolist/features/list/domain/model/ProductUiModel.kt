package com.yonder.addtolist.features.list.domain.model

/**
 * Yusuf Onder on 12,May,2021
 */

data class ProductUiModel(
  var id: Int,
  var name: String,
  var isPopular: Boolean,
  var languageId: Int
)