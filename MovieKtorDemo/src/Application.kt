package com.movie

import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.html.respondHtml
import io.ktor.response.*
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.applicationEngineEnvironment
import io.ktor.server.engine.connector
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.html.body
import kotlinx.html.li
import kotlinx.html.ul

fun main(args: Array<String>) {
    val env = applicationEngineEnvironment {
        module {
            basic()
        }
        connector {
            port = 8080
            host = "localhost"
        }
    }
    embeddedServer(Netty, env).apply { start(true) }
}

const val ADMIN = "admin"
const val ADMIN_PASS = "admin"

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.basic(testing: Boolean = false) {

    install(Authentication) {
        basic {
            realm = "movie-ktor"
            validate { credentials ->
                if (credentials.name == ADMIN
                    && credentials.password == ADMIN_PASS
                ) {
                    UserIdPrincipal(ADMIN)
                } else {
                    null
                }
            }
        }
    }
    routing {

        authenticate {
            get("/") {
                println("I am at root")
                call.respondHtml {
                    body {
                        ul {
                            for (movie in marvelMovies) {
                                li { +"$movie" }
                            }
                        }
                    }
                }
            }
        }

    }
}

