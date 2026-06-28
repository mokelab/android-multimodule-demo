package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data251
import com.mokelab.demo.multimodule.core.model.Data252
import com.mokelab.demo.multimodule.core.model.Data253
import com.mokelab.demo.multimodule.core.model.Data254
import com.mokelab.demo.multimodule.core.model.Data255
import com.mokelab.demo.multimodule.core.model.Data256
import com.mokelab.demo.multimodule.core.model.Data257
import com.mokelab.demo.multimodule.core.model.Data258
import com.mokelab.demo.multimodule.core.model.Data259
import com.mokelab.demo.multimodule.core.model.Data260

import javax.inject.Inject

class Data326RepositoryImpl @Inject constructor(): Data326Repository {

    override fun get1(): Data251 {
        println("Debug log")
        println("Generate Data251")
        return Data251(id = 1) 
    }

    override fun get2(): Data252 {
        println("Debug log")
        println("Generate Data252")
        return Data252(id = 1) 
    }

    override fun get3(): Data253 {
        println("Debug log")
        println("Generate Data253")
        return Data253(id = 1) 
    }

    override fun get4(): Data254 {
        println("Debug log")
        println("Generate Data254")
        return Data254(id = 1) 
    }

    override fun get5(): Data255 {
        println("Debug log")
        println("Generate Data255")
        return Data255(id = 1) 
    }

    override fun get6(): Data256 {
        println("Debug log")
        println("Generate Data256")
        return Data256(id = 1) 
    }

    override fun get7(): Data257 {
        println("Debug log")
        println("Generate Data257")
        return Data257(id = 1) 
    }

    override fun get8(): Data258 {
        println("Debug log")
        println("Generate Data258")
        return Data258(id = 1) 
    }

    override fun get9(): Data259 {
        println("Debug log")
        println("Generate Data259")
        return Data259(id = 1) 
    }

    override fun get10(): Data260 {
        println("Debug log")
        println("Generate Data260")
        return Data260(id = 1) 
    }

}
