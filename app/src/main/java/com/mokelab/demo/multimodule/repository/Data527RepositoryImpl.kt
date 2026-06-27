package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data261
import com.mokelab.demo.multimodule.core.model.Data262
import com.mokelab.demo.multimodule.core.model.Data263
import com.mokelab.demo.multimodule.core.model.Data264
import com.mokelab.demo.multimodule.core.model.Data265
import com.mokelab.demo.multimodule.core.model.Data266
import com.mokelab.demo.multimodule.core.model.Data267
import com.mokelab.demo.multimodule.core.model.Data268
import com.mokelab.demo.multimodule.core.model.Data269
import com.mokelab.demo.multimodule.core.model.Data270

import javax.inject.Inject

class Data527RepositoryImpl @Inject constructor(): Data527Repository {

    override fun get1(): Data261 {
        println("Debug log")
        println("Generate Data261")
        return Data261(id = 1) 
    }

    override fun get2(): Data262 {
        println("Debug log")
        println("Generate Data262")
        return Data262(id = 1) 
    }

    override fun get3(): Data263 {
        println("Debug log")
        println("Generate Data263")
        return Data263(id = 1) 
    }

    override fun get4(): Data264 {
        println("Debug log")
        println("Generate Data264")
        return Data264(id = 1) 
    }

    override fun get5(): Data265 {
        println("Debug log")
        println("Generate Data265")
        return Data265(id = 1) 
    }

    override fun get6(): Data266 {
        println("Debug log")
        println("Generate Data266")
        return Data266(id = 1) 
    }

    override fun get7(): Data267 {
        println("Debug log")
        println("Generate Data267")
        return Data267(id = 1) 
    }

    override fun get8(): Data268 {
        println("Debug log")
        println("Generate Data268")
        return Data268(id = 1) 
    }

    override fun get9(): Data269 {
        println("Debug log")
        println("Generate Data269")
        return Data269(id = 1) 
    }

    override fun get10(): Data270 {
        println("Debug log")
        println("Generate Data270")
        return Data270(id = 1) 
    }

}
