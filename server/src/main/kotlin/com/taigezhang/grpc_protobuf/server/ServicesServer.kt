package com.taigezhang.grpc_protobuf.server

import com.google.inject.Inject
import com.google.inject.Singleton
import com.google.inject.name.Named
import io.grpc.BindableService
import io.grpc.Server
import io.grpc.ServerBuilder

@Singleton
class ServicesServer @Inject constructor(
    @Named("port") port: Int,
    grpcServices: java.util.Set<BindableService>
) {
    private val server: Server

    init {
        val serverBuilder = ServerBuilder.forPort(port)
        grpcServices.forEach { service ->
            serverBuilder.addService(service)
        }
        server = serverBuilder.build()
    }

    fun start() {
        server.start()
        println("Route guide server is running on port ${server.port}")
    }

    fun awaitTermination() {
        server.awaitTermination()
    }
}