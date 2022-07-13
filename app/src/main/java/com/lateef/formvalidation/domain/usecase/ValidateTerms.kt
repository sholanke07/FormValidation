package com.lateef.formvalidation.domain.usecase

import android.util.Patterns
import java.util.regex.Pattern

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): ValidationResult{
        if (!acceptedTerms){
            return ValidationResult(
                successful = false,
                errorMessage = "Please accept the terms"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}