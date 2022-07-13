package com.lateef.formvalidation.domain.usecase

import android.util.Patterns
import java.util.regex.Pattern

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String): ValidationResult{
        if (password != repeatedPassword){
            return ValidationResult(
                successful = false,
                errorMessage = "The passwords don't match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}