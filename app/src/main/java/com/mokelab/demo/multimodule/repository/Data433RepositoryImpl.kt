package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data321
import com.mokelab.demo.multimodule.core.model.Data322
import com.mokelab.demo.multimodule.core.model.Data323
import com.mokelab.demo.multimodule.core.model.Data324
import com.mokelab.demo.multimodule.core.model.Data325
import com.mokelab.demo.multimodule.core.model.Data326
import com.mokelab.demo.multimodule.core.model.Data327
import com.mokelab.demo.multimodule.core.model.Data328
import com.mokelab.demo.multimodule.core.model.Data329
import com.mokelab.demo.multimodule.core.model.Data330

import javax.inject.Inject

class Data433RepositoryImpl @Inject constructor(): Data433Repository {

    override fun get1(): Data321 {
        println("Debug log")
        println("Generate Data321")
        return Data321(id = 1) 
    }

    override fun get2(): Data322 {
        println("Debug log")
        println("Generate Data322")
        return Data322(id = 1) 
    }

    override fun get3(): Data323 {
        println("Debug log")
        println("Generate Data323")
        return Data323(id = 1) 
    }

    override fun get4(): Data324 {
        println("Debug log")
        println("Generate Data324")
        return Data324(id = 1) 
    }

    override fun get5(): Data325 {
        println("Debug log")
        println("Generate Data325")
        return Data325(id = 1) 
    }

    override fun get6(): Data326 {
        println("Debug log")
        println("Generate Data326")
        return Data326(id = 1) 
    }

    override fun get7(): Data327 {
        println("Debug log")
        println("Generate Data327")
        return Data327(id = 1) 
    }

    override fun get8(): Data328 {
        println("Debug log")
        println("Generate Data328")
        return Data328(id = 1) 
    }

    override fun get9(): Data329 {
        println("Debug log")
        println("Generate Data329")
        return Data329(id = 1) 
    }

    override fun get10(): Data330 {
        println("Debug log")
        println("Generate Data330")
        return Data330(id = 1) 
    }

}
