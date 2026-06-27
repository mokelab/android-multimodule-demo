package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data301
import com.mokelab.demo.multimodule.core.model.Data302
import com.mokelab.demo.multimodule.core.model.Data303
import com.mokelab.demo.multimodule.core.model.Data304
import com.mokelab.demo.multimodule.core.model.Data305
import com.mokelab.demo.multimodule.core.model.Data306
import com.mokelab.demo.multimodule.core.model.Data307
import com.mokelab.demo.multimodule.core.model.Data308
import com.mokelab.demo.multimodule.core.model.Data309
import com.mokelab.demo.multimodule.core.model.Data310

import javax.inject.Inject

class Data531RepositoryImpl @Inject constructor(): Data531Repository {

    override fun get1(): Data301 {
        println("Debug log")
        println("Generate Data301")
        return Data301(id = 1) 
    }

    override fun get2(): Data302 {
        println("Debug log")
        println("Generate Data302")
        return Data302(id = 1) 
    }

    override fun get3(): Data303 {
        println("Debug log")
        println("Generate Data303")
        return Data303(id = 1) 
    }

    override fun get4(): Data304 {
        println("Debug log")
        println("Generate Data304")
        return Data304(id = 1) 
    }

    override fun get5(): Data305 {
        println("Debug log")
        println("Generate Data305")
        return Data305(id = 1) 
    }

    override fun get6(): Data306 {
        println("Debug log")
        println("Generate Data306")
        return Data306(id = 1) 
    }

    override fun get7(): Data307 {
        println("Debug log")
        println("Generate Data307")
        return Data307(id = 1) 
    }

    override fun get8(): Data308 {
        println("Debug log")
        println("Generate Data308")
        return Data308(id = 1) 
    }

    override fun get9(): Data309 {
        println("Debug log")
        println("Generate Data309")
        return Data309(id = 1) 
    }

    override fun get10(): Data310 {
        println("Debug log")
        println("Generate Data310")
        return Data310(id = 1) 
    }

}
