package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data351
import com.mokelab.demo.multimodule.model.Data352
import com.mokelab.demo.multimodule.model.Data353
import com.mokelab.demo.multimodule.model.Data354
import com.mokelab.demo.multimodule.model.Data355
import com.mokelab.demo.multimodule.model.Data356
import com.mokelab.demo.multimodule.model.Data357
import com.mokelab.demo.multimodule.model.Data358
import com.mokelab.demo.multimodule.model.Data359
import com.mokelab.demo.multimodule.model.Data360

import javax.inject.Inject

class Data136RepositoryImpl @Inject constructor(): Data136Repository {

    override fun get1(): Data351 {
        println("Debug log")
        println("Generate Data351")
        return Data351(id = 1) 
    }

    override fun get2(): Data352 {
        println("Debug log")
        println("Generate Data352")
        return Data352(id = 1) 
    }

    override fun get3(): Data353 {
        println("Debug log")
        println("Generate Data353")
        return Data353(id = 1) 
    }

    override fun get4(): Data354 {
        println("Debug log")
        println("Generate Data354")
        return Data354(id = 1) 
    }

    override fun get5(): Data355 {
        println("Debug log")
        println("Generate Data355")
        return Data355(id = 1) 
    }

    override fun get6(): Data356 {
        println("Debug log")
        println("Generate Data356")
        return Data356(id = 1) 
    }

    override fun get7(): Data357 {
        println("Debug log")
        println("Generate Data357")
        return Data357(id = 1) 
    }

    override fun get8(): Data358 {
        println("Debug log")
        println("Generate Data358")
        return Data358(id = 1) 
    }

    override fun get9(): Data359 {
        println("Debug log")
        println("Generate Data359")
        return Data359(id = 1) 
    }

    override fun get10(): Data360 {
        println("Debug log")
        println("Generate Data360")
        return Data360(id = 1) 
    }

}
