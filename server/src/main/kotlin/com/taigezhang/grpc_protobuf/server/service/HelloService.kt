package com.taigezhang.grpc_protobuf.server.service

import com.google.inject.Singleton
import com.taigezhang.grpc_protobuf.protobuf.hello_service.HelloServiceGrpcKt
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloRequest
import com.taigezhang.grpc_protobuf.protobuf.hello_service.SayHelloResponse

@Singleton
class HelloService : HelloServiceGrpcKt.HelloServiceCoroutineImplBase() {
    override suspend fun sayHello(request: SayHelloRequest): SayHelloResponse {
        val name = request.name.ifEmpty { "friend" }
        return SayHelloResponse.newBuilder().setMessage("Hello $name!").build()
    }
}