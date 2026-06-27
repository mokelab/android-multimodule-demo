package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data391
import com.mokelab.demo.multimodule.model.Data392
import com.mokelab.demo.multimodule.model.Data393
import com.mokelab.demo.multimodule.model.Data394
import com.mokelab.demo.multimodule.model.Data395
import com.mokelab.demo.multimodule.model.Data396
import com.mokelab.demo.multimodule.model.Data397
import com.mokelab.demo.multimodule.model.Data398
import com.mokelab.demo.multimodule.model.Data399
import com.mokelab.demo.multimodule.model.Data400

import javax.inject.Inject

class Data240RepositoryImpl @Inject constructor(): Data240Repository {

    override fun get1(): Data391 {
        println("Debug log")
        println("Generate Data391")
        return Data391(id = 1) 
    }

    override fun get2(): Data392 {
        println("Debug log")
        println("Generate Data392")
        return Data392(id = 1) 
    }

    override fun get3(): Data393 {
        println("Debug log")
        println("Generate Data393")
        return Data393(id = 1) 
    }

    override fun get4(): Data394 {
        println("Debug log")
        println("Generate Data394")
        return Data394(id = 1) 
    }

    override fun get5(): Data395 {
        println("Debug log")
        println("Generate Data395")
        return Data395(id = 1) 
    }

    override fun get6(): Data396 {
        println("Debug log")
        println("Generate Data396")
        return Data396(id = 1) 
    }

    override fun get7(): Data397 {
        println("Debug log")
        println("Generate Data397")
        return Data397(id = 1) 
    }

    override fun get8(): Data398 {
        println("Debug log")
        println("Generate Data398")
        return Data398(id = 1) 
    }

    override fun get9(): Data399 {
        println("Debug log")
        println("Generate Data399")
        return Data399(id = 1) 
    }

    override fun get10(): Data400 {
        println("Debug log")
        println("Generate Data400")
        return Data400(id = 1) 
    }

}
