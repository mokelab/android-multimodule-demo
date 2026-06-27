package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data151
import com.mokelab.demo.multimodule.core.model.Data152
import com.mokelab.demo.multimodule.core.model.Data153
import com.mokelab.demo.multimodule.core.model.Data154
import com.mokelab.demo.multimodule.core.model.Data155
import com.mokelab.demo.multimodule.core.model.Data156
import com.mokelab.demo.multimodule.core.model.Data157
import com.mokelab.demo.multimodule.core.model.Data158
import com.mokelab.demo.multimodule.core.model.Data159
import com.mokelab.demo.multimodule.core.model.Data160

import javax.inject.Inject

class Data716RepositoryImpl @Inject constructor(): Data716Repository {

    override fun get1(): Data151 {
        println("Debug log")
        println("Generate Data151")
        return Data151(id = 1) 
    }

    override fun get2(): Data152 {
        println("Debug log")
        println("Generate Data152")
        return Data152(id = 1) 
    }

    override fun get3(): Data153 {
        println("Debug log")
        println("Generate Data153")
        return Data153(id = 1) 
    }

    override fun get4(): Data154 {
        println("Debug log")
        println("Generate Data154")
        return Data154(id = 1) 
    }

    override fun get5(): Data155 {
        println("Debug log")
        println("Generate Data155")
        return Data155(id = 1) 
    }

    override fun get6(): Data156 {
        println("Debug log")
        println("Generate Data156")
        return Data156(id = 1) 
    }

    override fun get7(): Data157 {
        println("Debug log")
        println("Generate Data157")
        return Data157(id = 1) 
    }

    override fun get8(): Data158 {
        println("Debug log")
        println("Generate Data158")
        return Data158(id = 1) 
    }

    override fun get9(): Data159 {
        println("Debug log")
        println("Generate Data159")
        return Data159(id = 1) 
    }

    override fun get10(): Data160 {
        println("Debug log")
        println("Generate Data160")
        return Data160(id = 1) 
    }

}
