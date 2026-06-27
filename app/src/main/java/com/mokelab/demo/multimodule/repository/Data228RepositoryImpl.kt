package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data271
import com.mokelab.demo.multimodule.core.model.Data272
import com.mokelab.demo.multimodule.core.model.Data273
import com.mokelab.demo.multimodule.core.model.Data274
import com.mokelab.demo.multimodule.core.model.Data275
import com.mokelab.demo.multimodule.core.model.Data276
import com.mokelab.demo.multimodule.core.model.Data277
import com.mokelab.demo.multimodule.core.model.Data278
import com.mokelab.demo.multimodule.core.model.Data279
import com.mokelab.demo.multimodule.core.model.Data280

import javax.inject.Inject

class Data228RepositoryImpl @Inject constructor(): Data228Repository {

    override fun get1(): Data271 {
        println("Debug log")
        println("Generate Data271")
        return Data271(id = 1) 
    }

    override fun get2(): Data272 {
        println("Debug log")
        println("Generate Data272")
        return Data272(id = 1) 
    }

    override fun get3(): Data273 {
        println("Debug log")
        println("Generate Data273")
        return Data273(id = 1) 
    }

    override fun get4(): Data274 {
        println("Debug log")
        println("Generate Data274")
        return Data274(id = 1) 
    }

    override fun get5(): Data275 {
        println("Debug log")
        println("Generate Data275")
        return Data275(id = 1) 
    }

    override fun get6(): Data276 {
        println("Debug log")
        println("Generate Data276")
        return Data276(id = 1) 
    }

    override fun get7(): Data277 {
        println("Debug log")
        println("Generate Data277")
        return Data277(id = 1) 
    }

    override fun get8(): Data278 {
        println("Debug log")
        println("Generate Data278")
        return Data278(id = 1) 
    }

    override fun get9(): Data279 {
        println("Debug log")
        println("Generate Data279")
        return Data279(id = 1) 
    }

    override fun get10(): Data280 {
        println("Debug log")
        println("Generate Data280")
        return Data280(id = 1) 
    }

}
