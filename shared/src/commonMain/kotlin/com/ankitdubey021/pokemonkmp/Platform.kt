package com.ankitdubey021.pokemonkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform