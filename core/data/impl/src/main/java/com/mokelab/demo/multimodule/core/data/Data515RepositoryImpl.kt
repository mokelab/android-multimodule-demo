package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data141
import com.mokelab.demo.multimodule.core.model.Data142
import com.mokelab.demo.multimodule.core.model.Data143
import com.mokelab.demo.multimodule.core.model.Data144
import com.mokelab.demo.multimodule.core.model.Data145
import com.mokelab.demo.multimodule.core.model.Data146
import com.mokelab.demo.multimodule.core.model.Data147
import com.mokelab.demo.multimodule.core.model.Data148
import com.mokelab.demo.multimodule.core.model.Data149
import com.mokelab.demo.multimodule.core.model.Data150

import javax.inject.Inject

class Data515RepositoryImpl @Inject constructor(): Data515Repository {

    override fun get1(): Data141 {
        println("Debug log")
        println("Generate Data141")
        return Data141(id = 1) 
    }

    override fun get2(): Data142 {
        println("Debug log")
        println("Generate Data142")
        return Data142(id = 1) 
    }

    override fun get3(): Data143 {
        println("Debug log")
        println("Generate Data143")
        return Data143(id = 1) 
    }

    override fun get4(): Data144 {
        println("Debug log")
        println("Generate Data144")
        return Data144(id = 1) 
    }

    override fun get5(): Data145 {
        println("Debug log")
        println("Generate Data145")
        return Data145(id = 1) 
    }

    override fun get6(): Data146 {
        println("Debug log")
        println("Generate Data146")
        return Data146(id = 1) 
    }

    override fun get7(): Data147 {
        println("Debug log")
        println("Generate Data147")
        return Data147(id = 1) 
    }

    override fun get8(): Data148 {
        println("Debug log")
        println("Generate Data148")
        return Data148(id = 1) 
    }

    override fun get9(): Data149 {
        println("Debug log")
        println("Generate Data149")
        return Data149(id = 1) 
    }

    override fun get10(): Data150 {
        println("Debug log")
        println("Generate Data150")
        return Data150(id = 1) 
    }

}
