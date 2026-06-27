package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data411
import com.mokelab.demo.multimodule.model.Data412
import com.mokelab.demo.multimodule.model.Data413
import com.mokelab.demo.multimodule.model.Data414
import com.mokelab.demo.multimodule.model.Data415
import com.mokelab.demo.multimodule.model.Data416
import com.mokelab.demo.multimodule.model.Data417
import com.mokelab.demo.multimodule.model.Data418
import com.mokelab.demo.multimodule.model.Data419
import com.mokelab.demo.multimodule.model.Data420

import javax.inject.Inject

class Data542RepositoryImpl @Inject constructor(): Data542Repository {

    override fun get1(): Data411 {
        println("Debug log")
        println("Generate Data411")
        return Data411(id = 1) 
    }

    override fun get2(): Data412 {
        println("Debug log")
        println("Generate Data412")
        return Data412(id = 1) 
    }

    override fun get3(): Data413 {
        println("Debug log")
        println("Generate Data413")
        return Data413(id = 1) 
    }

    override fun get4(): Data414 {
        println("Debug log")
        println("Generate Data414")
        return Data414(id = 1) 
    }

    override fun get5(): Data415 {
        println("Debug log")
        println("Generate Data415")
        return Data415(id = 1) 
    }

    override fun get6(): Data416 {
        println("Debug log")
        println("Generate Data416")
        return Data416(id = 1) 
    }

    override fun get7(): Data417 {
        println("Debug log")
        println("Generate Data417")
        return Data417(id = 1) 
    }

    override fun get8(): Data418 {
        println("Debug log")
        println("Generate Data418")
        return Data418(id = 1) 
    }

    override fun get9(): Data419 {
        println("Debug log")
        println("Generate Data419")
        return Data419(id = 1) 
    }

    override fun get10(): Data420 {
        println("Debug log")
        println("Generate Data420")
        return Data420(id = 1) 
    }

}
