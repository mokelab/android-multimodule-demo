package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data801
import com.mokelab.demo.multimodule.core.model.Data802
import com.mokelab.demo.multimodule.core.model.Data803
import com.mokelab.demo.multimodule.core.model.Data804
import com.mokelab.demo.multimodule.core.model.Data805
import com.mokelab.demo.multimodule.core.model.Data806
import com.mokelab.demo.multimodule.core.model.Data807
import com.mokelab.demo.multimodule.core.model.Data808
import com.mokelab.demo.multimodule.core.model.Data809
import com.mokelab.demo.multimodule.core.model.Data810

import javax.inject.Inject

class Data781RepositoryImpl @Inject constructor(): Data781Repository {

    override fun get1(): Data801 {
        println("Debug log")
        println("Generate Data801")
        return Data801(id = 1) 
    }

    override fun get2(): Data802 {
        println("Debug log")
        println("Generate Data802")
        return Data802(id = 1) 
    }

    override fun get3(): Data803 {
        println("Debug log")
        println("Generate Data803")
        return Data803(id = 1) 
    }

    override fun get4(): Data804 {
        println("Debug log")
        println("Generate Data804")
        return Data804(id = 1) 
    }

    override fun get5(): Data805 {
        println("Debug log")
        println("Generate Data805")
        return Data805(id = 1) 
    }

    override fun get6(): Data806 {
        println("Debug log")
        println("Generate Data806")
        return Data806(id = 1) 
    }

    override fun get7(): Data807 {
        println("Debug log")
        println("Generate Data807")
        return Data807(id = 1) 
    }

    override fun get8(): Data808 {
        println("Debug log")
        println("Generate Data808")
        return Data808(id = 1) 
    }

    override fun get9(): Data809 {
        println("Debug log")
        println("Generate Data809")
        return Data809(id = 1) 
    }

    override fun get10(): Data810 {
        println("Debug log")
        println("Generate Data810")
        return Data810(id = 1) 
    }

}
