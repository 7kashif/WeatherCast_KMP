package com.kashif.weathercast_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform