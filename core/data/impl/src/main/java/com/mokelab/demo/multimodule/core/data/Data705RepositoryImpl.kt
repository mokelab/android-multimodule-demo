package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data041
import com.mokelab.demo.multimodule.core.model.Data042
import com.mokelab.demo.multimodule.core.model.Data043
import com.mokelab.demo.multimodule.core.model.Data044
import com.mokelab.demo.multimodule.core.model.Data045
import com.mokelab.demo.multimodule.core.model.Data046
import com.mokelab.demo.multimodule.core.model.Data047
import com.mokelab.demo.multimodule.core.model.Data048
import com.mokelab.demo.multimodule.core.model.Data049
import com.mokelab.demo.multimodule.core.model.Data050

import javax.inject.Inject

class Data705RepositoryImpl @Inject constructor(): Data705Repository {

    override fun get1(): Data041 {
        println("Debug log")
        println("Generate Data041")
        return Data041(id = 1) 
    }

    override fun get2(): Data042 {
        println("Debug log")
        println("Generate Data042")
        return Data042(id = 1) 
    }

    override fun get3(): Data043 {
        println("Debug log")
        println("Generate Data043")
        return Data043(id = 1) 
    }

    override fun get4(): Data044 {
        println("Debug log")
        println("Generate Data044")
        return Data044(id = 1) 
    }

    override fun get5(): Data045 {
        println("Debug log")
        println("Generate Data045")
        return Data045(id = 1) 
    }

    override fun get6(): Data046 {
        println("Debug log")
        println("Generate Data046")
        return Data046(id = 1) 
    }

    override fun get7(): Data047 {
        println("Debug log")
        println("Generate Data047")
        return Data047(id = 1) 
    }

    override fun get8(): Data048 {
        println("Debug log")
        println("Generate Data048")
        return Data048(id = 1) 
    }

    override fun get9(): Data049 {
        println("Debug log")
        println("Generate Data049")
        return Data049(id = 1) 
    }

    override fun get10(): Data050 {
        println("Debug log")
        println("Generate Data050")
        return Data050(id = 1) 
    }

}
