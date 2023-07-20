package com.kmmproject.android

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform