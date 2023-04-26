package com.taigezhang.grpc_protobuf.client

import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloRequest
import kotlinx.coroutines.runBlocking

fun main() {
    val port = 1230
    val domain = "localhost"
    val helloServiceClient = HelloServiceClient(port, domain)
    val request = SayHelloRequest.newBuilder().setName("Taige").build()

    val response = runBlocking {
        helloServiceClient.sayHello(request)
    }

    println("Receiving $response")
}