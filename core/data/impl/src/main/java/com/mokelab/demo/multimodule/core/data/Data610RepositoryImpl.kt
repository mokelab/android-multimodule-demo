package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data091
import com.mokelab.demo.multimodule.core.model.Data092
import com.mokelab.demo.multimodule.core.model.Data093
import com.mokelab.demo.multimodule.core.model.Data094
import com.mokelab.demo.multimodule.core.model.Data095
import com.mokelab.demo.multimodule.core.model.Data096
import com.mokelab.demo.multimodule.core.model.Data097
import com.mokelab.demo.multimodule.core.model.Data098
import com.mokelab.demo.multimodule.core.model.Data099
import com.mokelab.demo.multimodule.core.model.Data100

import javax.inject.Inject

class Data610RepositoryImpl @Inject constructor(): Data610Repository {

    override fun get1(): Data091 {
        println("Debug log")
        println("Generate Data091")
        return Data091(id = 1) 
    }

    override fun get2(): Data092 {
        println("Debug log")
        println("Generate Data092")
        return Data092(id = 1) 
    }

    override fun get3(): Data093 {
        println("Debug log")
        println("Generate Data093")
        return Data093(id = 1) 
    }

    override fun get4(): Data094 {
        println("Debug log")
        println("Generate Data094")
        return Data094(id = 1) 
    }

    override fun get5(): Data095 {
        println("Debug log")
        println("Generate Data095")
        return Data095(id = 1) 
    }

    override fun get6(): Data096 {
        println("Debug log")
        println("Generate Data096")
        return Data096(id = 1) 
    }

    override fun get7(): Data097 {
        println("Debug log")
        println("Generate Data097")
        return Data097(id = 1) 
    }

    override fun get8(): Data098 {
        println("Debug log")
        println("Generate Data098")
        return Data098(id = 1) 
    }

    override fun get9(): Data099 {
        println("Debug log")
        println("Generate Data099")
        return Data099(id = 1) 
    }

    override fun get10(): Data100 {
        println("Debug log")
        println("Generate Data100")
        return Data100(id = 1) 
    }

}
