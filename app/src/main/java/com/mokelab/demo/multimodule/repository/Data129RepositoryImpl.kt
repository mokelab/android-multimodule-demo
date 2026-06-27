package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data281
import com.mokelab.demo.multimodule.core.model.Data282
import com.mokelab.demo.multimodule.core.model.Data283
import com.mokelab.demo.multimodule.core.model.Data284
import com.mokelab.demo.multimodule.core.model.Data285
import com.mokelab.demo.multimodule.core.model.Data286
import com.mokelab.demo.multimodule.core.model.Data287
import com.mokelab.demo.multimodule.core.model.Data288
import com.mokelab.demo.multimodule.core.model.Data289
import com.mokelab.demo.multimodule.core.model.Data290

import javax.inject.Inject

class Data129RepositoryImpl @Inject constructor(): Data129Repository {

    override fun get1(): Data281 {
        println("Debug log")
        println("Generate Data281")
        return Data281(id = 1) 
    }

    override fun get2(): Data282 {
        println("Debug log")
        println("Generate Data282")
        return Data282(id = 1) 
    }

    override fun get3(): Data283 {
        println("Debug log")
        println("Generate Data283")
        return Data283(id = 1) 
    }

    override fun get4(): Data284 {
        println("Debug log")
        println("Generate Data284")
        return Data284(id = 1) 
    }

    override fun get5(): Data285 {
        println("Debug log")
        println("Generate Data285")
        return Data285(id = 1) 
    }

    override fun get6(): Data286 {
        println("Debug log")
        println("Generate Data286")
        return Data286(id = 1) 
    }

    override fun get7(): Data287 {
        println("Debug log")
        println("Generate Data287")
        return Data287(id = 1) 
    }

    override fun get8(): Data288 {
        println("Debug log")
        println("Generate Data288")
        return Data288(id = 1) 
    }

    override fun get9(): Data289 {
        println("Debug log")
        println("Generate Data289")
        return Data289(id = 1) 
    }

    override fun get10(): Data290 {
        println("Debug log")
        println("Generate Data290")
        return Data290(id = 1) 
    }

}
