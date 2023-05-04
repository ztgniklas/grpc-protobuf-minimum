package com.taigezhang.grpc_protobuf.server

import com.google.inject.Guice
import com.taigezhang.grpc_protobuf.server.module.BasicModule
import com.taigezhang.grpc_protobuf.server.service.HelloService
import io.grpc.ServerBuilder

fun main() {
    val injector = Guice.createInjector(BasicModule())
    val servicesServer = injector.getInstance(ServicesServer::class.java)
    servicesServer.start()
    servicesServer.awaitTermination()
}