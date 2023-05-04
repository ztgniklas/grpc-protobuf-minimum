package com.taigezhang.grpc_protobuf.client

import com.google.inject.Inject
import com.google.inject.Singleton
import com.google.inject.name.Named
import com.taigezhang.grpc_protobuf.protobuf.hello_service.HelloServiceGrpcKt
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloRequest
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloResponse
import io.grpc.ManagedChannelBuilder

@Singleton
class HelloServiceClient @Inject constructor(
    @Named("port") private val port: Int,
    @Named("domain") private val domain: String
) {
    private val channel = ManagedChannelBuilder.forAddress(domain, port).usePlaintext().build()
    private val stub = HelloServiceGrpcKt.HelloServiceCoroutineStub(channel)

    suspend fun sayHello(request: SayHelloRequest): SayHelloResponse {
        return stub.sayHello(request)
    }
}