package com.taigezhang.grpc_protobuf.client

import com.taigezhang.grpc_protobuf.protobuf.hello_service.HelloServiceGrpcKt
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloRequest
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloResponse
import io.grpc.ManagedChannelBuilder

class HelloServiceClient(
    private val port: Int,
    private val domain: String
) {
    private val channel = ManagedChannelBuilder.forAddress(domain, port).usePlaintext().build()
    private val stub = HelloServiceGrpcKt.HelloServiceCoroutineStub(channel)

    suspend fun sayHello(request: SayHelloRequest): SayHelloResponse {
        return stub.sayHello(request)
    }
}