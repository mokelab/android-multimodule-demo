package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data131
import com.mokelab.demo.multimodule.core.model.Data132
import com.mokelab.demo.multimodule.core.model.Data133
import com.mokelab.demo.multimodule.core.model.Data134
import com.mokelab.demo.multimodule.core.model.Data135
import com.mokelab.demo.multimodule.core.model.Data136
import com.mokelab.demo.multimodule.core.model.Data137
import com.mokelab.demo.multimodule.core.model.Data138
import com.mokelab.demo.multimodule.core.model.Data139
import com.mokelab.demo.multimodule.core.model.Data140

import javax.inject.Inject

class Data214RepositoryImpl @Inject constructor(): Data214Repository {

    override fun get1(): Data131 {
        println("Debug log")
        println("Generate Data131")
        return Data131(id = 1) 
    }

    override fun get2(): Data132 {
        println("Debug log")
        println("Generate Data132")
        return Data132(id = 1) 
    }

    override fun get3(): Data133 {
        println("Debug log")
        println("Generate Data133")
        return Data133(id = 1) 
    }

    override fun get4(): Data134 {
        println("Debug log")
        println("Generate Data134")
        return Data134(id = 1) 
    }

    override fun get5(): Data135 {
        println("Debug log")
        println("Generate Data135")
        return Data135(id = 1) 
    }

    override fun get6(): Data136 {
        println("Debug log")
        println("Generate Data136")
        return Data136(id = 1) 
    }

    override fun get7(): Data137 {
        println("Debug log")
        println("Generate Data137")
        return Data137(id = 1) 
    }

    override fun get8(): Data138 {
        println("Debug log")
        println("Generate Data138")
        return Data138(id = 1) 
    }

    override fun get9(): Data139 {
        println("Debug log")
        println("Generate Data139")
        return Data139(id = 1) 
    }

    override fun get10(): Data140 {
        println("Debug log")
        println("Generate Data140")
        return Data140(id = 1) 
    }

}
