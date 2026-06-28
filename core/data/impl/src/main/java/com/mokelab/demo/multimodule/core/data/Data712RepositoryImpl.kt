package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data111
import com.mokelab.demo.multimodule.core.model.Data112
import com.mokelab.demo.multimodule.core.model.Data113
import com.mokelab.demo.multimodule.core.model.Data114
import com.mokelab.demo.multimodule.core.model.Data115
import com.mokelab.demo.multimodule.core.model.Data116
import com.mokelab.demo.multimodule.core.model.Data117
import com.mokelab.demo.multimodule.core.model.Data118
import com.mokelab.demo.multimodule.core.model.Data119
import com.mokelab.demo.multimodule.core.model.Data120

import javax.inject.Inject

class Data712RepositoryImpl @Inject constructor(): Data712Repository {

    override fun get1(): Data111 {
        println("Debug log")
        println("Generate Data111")
        return Data111(id = 1) 
    }

    override fun get2(): Data112 {
        println("Debug log")
        println("Generate Data112")
        return Data112(id = 1) 
    }

    override fun get3(): Data113 {
        println("Debug log")
        println("Generate Data113")
        return Data113(id = 1) 
    }

    override fun get4(): Data114 {
        println("Debug log")
        println("Generate Data114")
        return Data114(id = 1) 
    }

    override fun get5(): Data115 {
        println("Debug log")
        println("Generate Data115")
        return Data115(id = 1) 
    }

    override fun get6(): Data116 {
        println("Debug log")
        println("Generate Data116")
        return Data116(id = 1) 
    }

    override fun get7(): Data117 {
        println("Debug log")
        println("Generate Data117")
        return Data117(id = 1) 
    }

    override fun get8(): Data118 {
        println("Debug log")
        println("Generate Data118")
        return Data118(id = 1) 
    }

    override fun get9(): Data119 {
        println("Debug log")
        println("Generate Data119")
        return Data119(id = 1) 
    }

    override fun get10(): Data120 {
        println("Debug log")
        println("Generate Data120")
        return Data120(id = 1) 
    }

}
