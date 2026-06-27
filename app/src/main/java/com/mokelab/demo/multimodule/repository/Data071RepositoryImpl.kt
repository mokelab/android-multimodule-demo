package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data701
import com.mokelab.demo.multimodule.core.model.Data702
import com.mokelab.demo.multimodule.core.model.Data703
import com.mokelab.demo.multimodule.core.model.Data704
import com.mokelab.demo.multimodule.core.model.Data705
import com.mokelab.demo.multimodule.core.model.Data706
import com.mokelab.demo.multimodule.core.model.Data707
import com.mokelab.demo.multimodule.core.model.Data708
import com.mokelab.demo.multimodule.core.model.Data709
import com.mokelab.demo.multimodule.core.model.Data710

import javax.inject.Inject

class Data071RepositoryImpl @Inject constructor(): Data071Repository {

    override fun get1(): Data701 {
        println("Debug log")
        println("Generate Data701")
        return Data701(id = 1) 
    }

    override fun get2(): Data702 {
        println("Debug log")
        println("Generate Data702")
        return Data702(id = 1) 
    }

    override fun get3(): Data703 {
        println("Debug log")
        println("Generate Data703")
        return Data703(id = 1) 
    }

    override fun get4(): Data704 {
        println("Debug log")
        println("Generate Data704")
        return Data704(id = 1) 
    }

    override fun get5(): Data705 {
        println("Debug log")
        println("Generate Data705")
        return Data705(id = 1) 
    }

    override fun get6(): Data706 {
        println("Debug log")
        println("Generate Data706")
        return Data706(id = 1) 
    }

    override fun get7(): Data707 {
        println("Debug log")
        println("Generate Data707")
        return Data707(id = 1) 
    }

    override fun get8(): Data708 {
        println("Debug log")
        println("Generate Data708")
        return Data708(id = 1) 
    }

    override fun get9(): Data709 {
        println("Debug log")
        println("Generate Data709")
        return Data709(id = 1) 
    }

    override fun get10(): Data710 {
        println("Debug log")
        println("Generate Data710")
        return Data710(id = 1) 
    }

}
