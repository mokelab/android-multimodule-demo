package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data501
import com.mokelab.demo.multimodule.core.model.Data502
import com.mokelab.demo.multimodule.core.model.Data503
import com.mokelab.demo.multimodule.core.model.Data504
import com.mokelab.demo.multimodule.core.model.Data505
import com.mokelab.demo.multimodule.core.model.Data506
import com.mokelab.demo.multimodule.core.model.Data507
import com.mokelab.demo.multimodule.core.model.Data508
import com.mokelab.demo.multimodule.core.model.Data509
import com.mokelab.demo.multimodule.core.model.Data510

import javax.inject.Inject

class Data951RepositoryImpl @Inject constructor(): Data951Repository {

    override fun get1(): Data501 {
        println("Debug log")
        println("Generate Data501")
        return Data501(id = 1) 
    }

    override fun get2(): Data502 {
        println("Debug log")
        println("Generate Data502")
        return Data502(id = 1) 
    }

    override fun get3(): Data503 {
        println("Debug log")
        println("Generate Data503")
        return Data503(id = 1) 
    }

    override fun get4(): Data504 {
        println("Debug log")
        println("Generate Data504")
        return Data504(id = 1) 
    }

    override fun get5(): Data505 {
        println("Debug log")
        println("Generate Data505")
        return Data505(id = 1) 
    }

    override fun get6(): Data506 {
        println("Debug log")
        println("Generate Data506")
        return Data506(id = 1) 
    }

    override fun get7(): Data507 {
        println("Debug log")
        println("Generate Data507")
        return Data507(id = 1) 
    }

    override fun get8(): Data508 {
        println("Debug log")
        println("Generate Data508")
        return Data508(id = 1) 
    }

    override fun get9(): Data509 {
        println("Debug log")
        println("Generate Data509")
        return Data509(id = 1) 
    }

    override fun get10(): Data510 {
        println("Debug log")
        println("Generate Data510")
        return Data510(id = 1) 
    }

}
