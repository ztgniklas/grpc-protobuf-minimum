package com.taigezhang.grpc_protobuf.server.module

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.google.inject.multibindings.ProvidesIntoSet
import com.google.inject.name.Named
import com.taigezhang.grpc_protobuf.server.service.HelloService
import io.grpc.BindableService

class BasicModule: AbstractModule() {
    override fun configure() {
        super.configure()
    }

    @Provides
    @Named("port")
    fun getPort(): Int {
        return 1230
    }

    @ProvidesIntoSet
    fun getHelloService(service: HelloService): BindableService {
        return service
    }
}