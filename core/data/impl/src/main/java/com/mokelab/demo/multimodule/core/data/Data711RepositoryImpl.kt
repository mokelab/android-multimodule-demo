package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data101
import com.mokelab.demo.multimodule.core.model.Data102
import com.mokelab.demo.multimodule.core.model.Data103
import com.mokelab.demo.multimodule.core.model.Data104
import com.mokelab.demo.multimodule.core.model.Data105
import com.mokelab.demo.multimodule.core.model.Data106
import com.mokelab.demo.multimodule.core.model.Data107
import com.mokelab.demo.multimodule.core.model.Data108
import com.mokelab.demo.multimodule.core.model.Data109
import com.mokelab.demo.multimodule.core.model.Data110

import javax.inject.Inject

class Data711RepositoryImpl @Inject constructor(): Data711Repository {

    override fun get1(): Data101 {
        println("Debug log")
        println("Generate Data101")
        return Data101(id = 1) 
    }

    override fun get2(): Data102 {
        println("Debug log")
        println("Generate Data102")
        return Data102(id = 1) 
    }

    override fun get3(): Data103 {
        println("Debug log")
        println("Generate Data103")
        return Data103(id = 1) 
    }

    override fun get4(): Data104 {
        println("Debug log")
        println("Generate Data104")
        return Data104(id = 1) 
    }

    override fun get5(): Data105 {
        println("Debug log")
        println("Generate Data105")
        return Data105(id = 1) 
    }

    override fun get6(): Data106 {
        println("Debug log")
        println("Generate Data106")
        return Data106(id = 1) 
    }

    override fun get7(): Data107 {
        println("Debug log")
        println("Generate Data107")
        return Data107(id = 1) 
    }

    override fun get8(): Data108 {
        println("Debug log")
        println("Generate Data108")
        return Data108(id = 1) 
    }

    override fun get9(): Data109 {
        println("Debug log")
        println("Generate Data109")
        return Data109(id = 1) 
    }

    override fun get10(): Data110 {
        println("Debug log")
        println("Generate Data110")
        return Data110(id = 1) 
    }

}
