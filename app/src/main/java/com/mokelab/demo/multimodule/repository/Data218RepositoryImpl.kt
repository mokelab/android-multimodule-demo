package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data171
import com.mokelab.demo.multimodule.model.Data172
import com.mokelab.demo.multimodule.model.Data173
import com.mokelab.demo.multimodule.model.Data174
import com.mokelab.demo.multimodule.model.Data175
import com.mokelab.demo.multimodule.model.Data176
import com.mokelab.demo.multimodule.model.Data177
import com.mokelab.demo.multimodule.model.Data178
import com.mokelab.demo.multimodule.model.Data179
import com.mokelab.demo.multimodule.model.Data180

import javax.inject.Inject

class Data218RepositoryImpl @Inject constructor(): Data218Repository {

    override fun get1(): Data171 {
        println("Debug log")
        println("Generate Data171")
        return Data171(id = 1) 
    }

    override fun get2(): Data172 {
        println("Debug log")
        println("Generate Data172")
        return Data172(id = 1) 
    }

    override fun get3(): Data173 {
        println("Debug log")
        println("Generate Data173")
        return Data173(id = 1) 
    }

    override fun get4(): Data174 {
        println("Debug log")
        println("Generate Data174")
        return Data174(id = 1) 
    }

    override fun get5(): Data175 {
        println("Debug log")
        println("Generate Data175")
        return Data175(id = 1) 
    }

    override fun get6(): Data176 {
        println("Debug log")
        println("Generate Data176")
        return Data176(id = 1) 
    }

    override fun get7(): Data177 {
        println("Debug log")
        println("Generate Data177")
        return Data177(id = 1) 
    }

    override fun get8(): Data178 {
        println("Debug log")
        println("Generate Data178")
        return Data178(id = 1) 
    }

    override fun get9(): Data179 {
        println("Debug log")
        println("Generate Data179")
        return Data179(id = 1) 
    }

    override fun get10(): Data180 {
        println("Debug log")
        println("Generate Data180")
        return Data180(id = 1) 
    }

}
