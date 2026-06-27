package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data161
import com.mokelab.demo.multimodule.core.model.Data162
import com.mokelab.demo.multimodule.core.model.Data163
import com.mokelab.demo.multimodule.core.model.Data164
import com.mokelab.demo.multimodule.core.model.Data165
import com.mokelab.demo.multimodule.core.model.Data166
import com.mokelab.demo.multimodule.core.model.Data167
import com.mokelab.demo.multimodule.core.model.Data168
import com.mokelab.demo.multimodule.core.model.Data169
import com.mokelab.demo.multimodule.core.model.Data170

import javax.inject.Inject

class Data017RepositoryImpl @Inject constructor(): Data017Repository {

    override fun get1(): Data161 {
        println("Debug log")
        println("Generate Data161")
        return Data161(id = 1) 
    }

    override fun get2(): Data162 {
        println("Debug log")
        println("Generate Data162")
        return Data162(id = 1) 
    }

    override fun get3(): Data163 {
        println("Debug log")
        println("Generate Data163")
        return Data163(id = 1) 
    }

    override fun get4(): Data164 {
        println("Debug log")
        println("Generate Data164")
        return Data164(id = 1) 
    }

    override fun get5(): Data165 {
        println("Debug log")
        println("Generate Data165")
        return Data165(id = 1) 
    }

    override fun get6(): Data166 {
        println("Debug log")
        println("Generate Data166")
        return Data166(id = 1) 
    }

    override fun get7(): Data167 {
        println("Debug log")
        println("Generate Data167")
        return Data167(id = 1) 
    }

    override fun get8(): Data168 {
        println("Debug log")
        println("Generate Data168")
        return Data168(id = 1) 
    }

    override fun get9(): Data169 {
        println("Debug log")
        println("Generate Data169")
        return Data169(id = 1) 
    }

    override fun get10(): Data170 {
        println("Debug log")
        println("Generate Data170")
        return Data170(id = 1) 
    }

}
