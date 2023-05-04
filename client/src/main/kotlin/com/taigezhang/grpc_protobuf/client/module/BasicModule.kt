package com.taigezhang.grpc_protobuf.client.module

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.google.inject.name.Named

class BasicModule: AbstractModule() {
    override fun configure() {
        super.configure()
    }

    @Provides
    @Named("port")
    fun getServerPort(): Int {
        return 1230
    }

    @Provides
    @Named("domain")
    fun getServerDomain(): String {
        return "localhost"
    }
}