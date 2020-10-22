package com.ehab.modular.domain.utils

import kotlinx.coroutines.flow.Flow


abstract class UseCase<T> {
    abstract suspend fun excute():Flow<T>
}