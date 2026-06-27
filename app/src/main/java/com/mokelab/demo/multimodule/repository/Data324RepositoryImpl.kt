package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data231
import com.mokelab.demo.multimodule.model.Data232
import com.mokelab.demo.multimodule.model.Data233
import com.mokelab.demo.multimodule.model.Data234
import com.mokelab.demo.multimodule.model.Data235
import com.mokelab.demo.multimodule.model.Data236
import com.mokelab.demo.multimodule.model.Data237
import com.mokelab.demo.multimodule.model.Data238
import com.mokelab.demo.multimodule.model.Data239
import com.mokelab.demo.multimodule.model.Data240

import javax.inject.Inject

class Data324RepositoryImpl @Inject constructor(): Data324Repository {

    override fun get1(): Data231 {
        println("Debug log")
        println("Generate Data231")
        return Data231(id = 1) 
    }

    override fun get2(): Data232 {
        println("Debug log")
        println("Generate Data232")
        return Data232(id = 1) 
    }

    override fun get3(): Data233 {
        println("Debug log")
        println("Generate Data233")
        return Data233(id = 1) 
    }

    override fun get4(): Data234 {
        println("Debug log")
        println("Generate Data234")
        return Data234(id = 1) 
    }

    override fun get5(): Data235 {
        println("Debug log")
        println("Generate Data235")
        return Data235(id = 1) 
    }

    override fun get6(): Data236 {
        println("Debug log")
        println("Generate Data236")
        return Data236(id = 1) 
    }

    override fun get7(): Data237 {
        println("Debug log")
        println("Generate Data237")
        return Data237(id = 1) 
    }

    override fun get8(): Data238 {
        println("Debug log")
        println("Generate Data238")
        return Data238(id = 1) 
    }

    override fun get9(): Data239 {
        println("Debug log")
        println("Generate Data239")
        return Data239(id = 1) 
    }

    override fun get10(): Data240 {
        println("Debug log")
        println("Generate Data240")
        return Data240(id = 1) 
    }

}
