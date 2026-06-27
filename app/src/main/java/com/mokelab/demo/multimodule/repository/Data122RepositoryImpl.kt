package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data211
import com.mokelab.demo.multimodule.model.Data212
import com.mokelab.demo.multimodule.model.Data213
import com.mokelab.demo.multimodule.model.Data214
import com.mokelab.demo.multimodule.model.Data215
import com.mokelab.demo.multimodule.model.Data216
import com.mokelab.demo.multimodule.model.Data217
import com.mokelab.demo.multimodule.model.Data218
import com.mokelab.demo.multimodule.model.Data219
import com.mokelab.demo.multimodule.model.Data220

import javax.inject.Inject

class Data122RepositoryImpl @Inject constructor(): Data122Repository {

    override fun get1(): Data211 {
        println("Debug log")
        println("Generate Data211")
        return Data211(id = 1) 
    }

    override fun get2(): Data212 {
        println("Debug log")
        println("Generate Data212")
        return Data212(id = 1) 
    }

    override fun get3(): Data213 {
        println("Debug log")
        println("Generate Data213")
        return Data213(id = 1) 
    }

    override fun get4(): Data214 {
        println("Debug log")
        println("Generate Data214")
        return Data214(id = 1) 
    }

    override fun get5(): Data215 {
        println("Debug log")
        println("Generate Data215")
        return Data215(id = 1) 
    }

    override fun get6(): Data216 {
        println("Debug log")
        println("Generate Data216")
        return Data216(id = 1) 
    }

    override fun get7(): Data217 {
        println("Debug log")
        println("Generate Data217")
        return Data217(id = 1) 
    }

    override fun get8(): Data218 {
        println("Debug log")
        println("Generate Data218")
        return Data218(id = 1) 
    }

    override fun get9(): Data219 {
        println("Debug log")
        println("Generate Data219")
        return Data219(id = 1) 
    }

    override fun get10(): Data220 {
        println("Debug log")
        println("Generate Data220")
        return Data220(id = 1) 
    }

}
