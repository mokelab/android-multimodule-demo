package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data241
import com.mokelab.demo.multimodule.core.model.Data242
import com.mokelab.demo.multimodule.core.model.Data243
import com.mokelab.demo.multimodule.core.model.Data244
import com.mokelab.demo.multimodule.core.model.Data245
import com.mokelab.demo.multimodule.core.model.Data246
import com.mokelab.demo.multimodule.core.model.Data247
import com.mokelab.demo.multimodule.core.model.Data248
import com.mokelab.demo.multimodule.core.model.Data249
import com.mokelab.demo.multimodule.core.model.Data250

import javax.inject.Inject

class Data525RepositoryImpl @Inject constructor(): Data525Repository {

    override fun get1(): Data241 {
        println("Debug log")
        println("Generate Data241")
        return Data241(id = 1) 
    }

    override fun get2(): Data242 {
        println("Debug log")
        println("Generate Data242")
        return Data242(id = 1) 
    }

    override fun get3(): Data243 {
        println("Debug log")
        println("Generate Data243")
        return Data243(id = 1) 
    }

    override fun get4(): Data244 {
        println("Debug log")
        println("Generate Data244")
        return Data244(id = 1) 
    }

    override fun get5(): Data245 {
        println("Debug log")
        println("Generate Data245")
        return Data245(id = 1) 
    }

    override fun get6(): Data246 {
        println("Debug log")
        println("Generate Data246")
        return Data246(id = 1) 
    }

    override fun get7(): Data247 {
        println("Debug log")
        println("Generate Data247")
        return Data247(id = 1) 
    }

    override fun get8(): Data248 {
        println("Debug log")
        println("Generate Data248")
        return Data248(id = 1) 
    }

    override fun get9(): Data249 {
        println("Debug log")
        println("Generate Data249")
        return Data249(id = 1) 
    }

    override fun get10(): Data250 {
        println("Debug log")
        println("Generate Data250")
        return Data250(id = 1) 
    }

}
