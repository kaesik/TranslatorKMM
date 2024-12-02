package com.kaesik.translatorkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform