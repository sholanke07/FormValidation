package com.lateef.formvalidation.domain.usecase

import android.util.Patterns
import java.util.regex.Pattern

class ValidatePassword {

    fun execute(password: String): ValidationResult{
        if (password.length < 8){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to consist of at least 8 characters"
            )
        }
        val containsLetterAndDigits = password.any{ it.isDigit() } &&
                password.any { it.isLetter() }

        if (!containsLetterAndDigits){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to contain at least one letter and digit"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}