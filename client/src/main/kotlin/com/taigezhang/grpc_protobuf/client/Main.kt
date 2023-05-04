package com.taigezhang.grpc_protobuf.client

import com.google.inject.Guice
import com.taigezhang.grpc_protobuf.client.module.BasicModule
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloRequest
import kotlinx.coroutines.runBlocking

fun main() {
    val injector = Guice.createInjector(BasicModule())
    val helloServiceClient = injector.getInstance(HelloServiceClient::class.java)
    val request = SayHelloRequest.newBuilder().setName("Taige").build()

    val response = runBlocking {
        helloServiceClient.sayHello(request)
    }

    println("Receiving $response")
}