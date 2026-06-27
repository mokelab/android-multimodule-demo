package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data311
import com.mokelab.demo.multimodule.model.Data312
import com.mokelab.demo.multimodule.model.Data313
import com.mokelab.demo.multimodule.model.Data314
import com.mokelab.demo.multimodule.model.Data315
import com.mokelab.demo.multimodule.model.Data316
import com.mokelab.demo.multimodule.model.Data317
import com.mokelab.demo.multimodule.model.Data318
import com.mokelab.demo.multimodule.model.Data319
import com.mokelab.demo.multimodule.model.Data320

import javax.inject.Inject

class Data332RepositoryImpl @Inject constructor(): Data332Repository {

    override fun get1(): Data311 {
        println("Debug log")
        println("Generate Data311")
        return Data311(id = 1) 
    }

    override fun get2(): Data312 {
        println("Debug log")
        println("Generate Data312")
        return Data312(id = 1) 
    }

    override fun get3(): Data313 {
        println("Debug log")
        println("Generate Data313")
        return Data313(id = 1) 
    }

    override fun get4(): Data314 {
        println("Debug log")
        println("Generate Data314")
        return Data314(id = 1) 
    }

    override fun get5(): Data315 {
        println("Debug log")
        println("Generate Data315")
        return Data315(id = 1) 
    }

    override fun get6(): Data316 {
        println("Debug log")
        println("Generate Data316")
        return Data316(id = 1) 
    }

    override fun get7(): Data317 {
        println("Debug log")
        println("Generate Data317")
        return Data317(id = 1) 
    }

    override fun get8(): Data318 {
        println("Debug log")
        println("Generate Data318")
        return Data318(id = 1) 
    }

    override fun get9(): Data319 {
        println("Debug log")
        println("Generate Data319")
        return Data319(id = 1) 
    }

    override fun get10(): Data320 {
        println("Debug log")
        println("Generate Data320")
        return Data320(id = 1) 
    }

}
