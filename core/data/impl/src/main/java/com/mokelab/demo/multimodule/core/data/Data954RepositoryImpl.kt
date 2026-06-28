package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data531
import com.mokelab.demo.multimodule.core.model.Data532
import com.mokelab.demo.multimodule.core.model.Data533
import com.mokelab.demo.multimodule.core.model.Data534
import com.mokelab.demo.multimodule.core.model.Data535
import com.mokelab.demo.multimodule.core.model.Data536
import com.mokelab.demo.multimodule.core.model.Data537
import com.mokelab.demo.multimodule.core.model.Data538
import com.mokelab.demo.multimodule.core.model.Data539
import com.mokelab.demo.multimodule.core.model.Data540

import javax.inject.Inject

class Data954RepositoryImpl @Inject constructor(): Data954Repository {

    override fun get1(): Data531 {
        println("Debug log")
        println("Generate Data531")
        return Data531(id = 1) 
    }

    override fun get2(): Data532 {
        println("Debug log")
        println("Generate Data532")
        return Data532(id = 1) 
    }

    override fun get3(): Data533 {
        println("Debug log")
        println("Generate Data533")
        return Data533(id = 1) 
    }

    override fun get4(): Data534 {
        println("Debug log")
        println("Generate Data534")
        return Data534(id = 1) 
    }

    override fun get5(): Data535 {
        println("Debug log")
        println("Generate Data535")
        return Data535(id = 1) 
    }

    override fun get6(): Data536 {
        println("Debug log")
        println("Generate Data536")
        return Data536(id = 1) 
    }

    override fun get7(): Data537 {
        println("Debug log")
        println("Generate Data537")
        return Data537(id = 1) 
    }

    override fun get8(): Data538 {
        println("Debug log")
        println("Generate Data538")
        return Data538(id = 1) 
    }

    override fun get9(): Data539 {
        println("Debug log")
        println("Generate Data539")
        return Data539(id = 1) 
    }

    override fun get10(): Data540 {
        println("Debug log")
        println("Generate Data540")
        return Data540(id = 1) 
    }

}
