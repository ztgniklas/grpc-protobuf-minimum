package com.taigezhang.grpc_protobuf.server

import io.grpc.Server

class HelloServer(private val server: Server) {
    fun start() {
        server.start()
        println("Route guide server is running on port ${server.port}")
    }

    fun awaitTermination() {
        server.awaitTermination()
    }
}