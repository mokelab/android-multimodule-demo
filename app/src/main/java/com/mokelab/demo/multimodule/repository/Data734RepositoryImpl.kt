package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data331
import com.mokelab.demo.multimodule.model.Data332
import com.mokelab.demo.multimodule.model.Data333
import com.mokelab.demo.multimodule.model.Data334
import com.mokelab.demo.multimodule.model.Data335
import com.mokelab.demo.multimodule.model.Data336
import com.mokelab.demo.multimodule.model.Data337
import com.mokelab.demo.multimodule.model.Data338
import com.mokelab.demo.multimodule.model.Data339
import com.mokelab.demo.multimodule.model.Data340

import javax.inject.Inject

class Data734RepositoryImpl @Inject constructor(): Data734Repository {

    override fun get1(): Data331 {
        println("Debug log")
        println("Generate Data331")
        return Data331(id = 1) 
    }

    override fun get2(): Data332 {
        println("Debug log")
        println("Generate Data332")
        return Data332(id = 1) 
    }

    override fun get3(): Data333 {
        println("Debug log")
        println("Generate Data333")
        return Data333(id = 1) 
    }

    override fun get4(): Data334 {
        println("Debug log")
        println("Generate Data334")
        return Data334(id = 1) 
    }

    override fun get5(): Data335 {
        println("Debug log")
        println("Generate Data335")
        return Data335(id = 1) 
    }

    override fun get6(): Data336 {
        println("Debug log")
        println("Generate Data336")
        return Data336(id = 1) 
    }

    override fun get7(): Data337 {
        println("Debug log")
        println("Generate Data337")
        return Data337(id = 1) 
    }

    override fun get8(): Data338 {
        println("Debug log")
        println("Generate Data338")
        return Data338(id = 1) 
    }

    override fun get9(): Data339 {
        println("Debug log")
        println("Generate Data339")
        return Data339(id = 1) 
    }

    override fun get10(): Data340 {
        println("Debug log")
        println("Generate Data340")
        return Data340(id = 1) 
    }

}
