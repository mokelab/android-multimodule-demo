package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data341
import com.mokelab.demo.multimodule.model.Data342
import com.mokelab.demo.multimodule.model.Data343
import com.mokelab.demo.multimodule.model.Data344
import com.mokelab.demo.multimodule.model.Data345
import com.mokelab.demo.multimodule.model.Data346
import com.mokelab.demo.multimodule.model.Data347
import com.mokelab.demo.multimodule.model.Data348
import com.mokelab.demo.multimodule.model.Data349
import com.mokelab.demo.multimodule.model.Data350

import javax.inject.Inject

class Data035RepositoryImpl @Inject constructor(): Data035Repository {

    override fun get1(): Data341 {
        println("Debug log")
        println("Generate Data341")
        return Data341(id = 1) 
    }

    override fun get2(): Data342 {
        println("Debug log")
        println("Generate Data342")
        return Data342(id = 1) 
    }

    override fun get3(): Data343 {
        println("Debug log")
        println("Generate Data343")
        return Data343(id = 1) 
    }

    override fun get4(): Data344 {
        println("Debug log")
        println("Generate Data344")
        return Data344(id = 1) 
    }

    override fun get5(): Data345 {
        println("Debug log")
        println("Generate Data345")
        return Data345(id = 1) 
    }

    override fun get6(): Data346 {
        println("Debug log")
        println("Generate Data346")
        return Data346(id = 1) 
    }

    override fun get7(): Data347 {
        println("Debug log")
        println("Generate Data347")
        return Data347(id = 1) 
    }

    override fun get8(): Data348 {
        println("Debug log")
        println("Generate Data348")
        return Data348(id = 1) 
    }

    override fun get9(): Data349 {
        println("Debug log")
        println("Generate Data349")
        return Data349(id = 1) 
    }

    override fun get10(): Data350 {
        println("Debug log")
        println("Generate Data350")
        return Data350(id = 1) 
    }

}
