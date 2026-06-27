package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data061
import com.mokelab.demo.multimodule.core.model.Data062
import com.mokelab.demo.multimodule.core.model.Data063
import com.mokelab.demo.multimodule.core.model.Data064
import com.mokelab.demo.multimodule.core.model.Data065
import com.mokelab.demo.multimodule.core.model.Data066
import com.mokelab.demo.multimodule.core.model.Data067
import com.mokelab.demo.multimodule.core.model.Data068
import com.mokelab.demo.multimodule.core.model.Data069
import com.mokelab.demo.multimodule.core.model.Data070

import javax.inject.Inject

class Data507RepositoryImpl @Inject constructor(): Data507Repository {

    override fun get1(): Data061 {
        println("Debug log")
        println("Generate Data061")
        return Data061(id = 1) 
    }

    override fun get2(): Data062 {
        println("Debug log")
        println("Generate Data062")
        return Data062(id = 1) 
    }

    override fun get3(): Data063 {
        println("Debug log")
        println("Generate Data063")
        return Data063(id = 1) 
    }

    override fun get4(): Data064 {
        println("Debug log")
        println("Generate Data064")
        return Data064(id = 1) 
    }

    override fun get5(): Data065 {
        println("Debug log")
        println("Generate Data065")
        return Data065(id = 1) 
    }

    override fun get6(): Data066 {
        println("Debug log")
        println("Generate Data066")
        return Data066(id = 1) 
    }

    override fun get7(): Data067 {
        println("Debug log")
        println("Generate Data067")
        return Data067(id = 1) 
    }

    override fun get8(): Data068 {
        println("Debug log")
        println("Generate Data068")
        return Data068(id = 1) 
    }

    override fun get9(): Data069 {
        println("Debug log")
        println("Generate Data069")
        return Data069(id = 1) 
    }

    override fun get10(): Data070 {
        println("Debug log")
        println("Generate Data070")
        return Data070(id = 1) 
    }

}
