package com.lateef.formvalidation.domain.usecase

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
