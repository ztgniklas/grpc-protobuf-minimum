package com.taigezhang.grpc_protobuf.server

import com.taigezhang.grpc_protobuf.server.service.HelloService
import io.grpc.ServerBuilder

fun main() {
    val port = 1230
    val helloServer = HelloServer(
        server = ServerBuilder
            .forPort(port)
            .addService(HelloService())
            .build()
    )
    helloServer.start()
    helloServer.awaitTermination()
}