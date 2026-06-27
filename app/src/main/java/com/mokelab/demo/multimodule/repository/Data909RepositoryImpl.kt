package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data081
import com.mokelab.demo.multimodule.model.Data082
import com.mokelab.demo.multimodule.model.Data083
import com.mokelab.demo.multimodule.model.Data084
import com.mokelab.demo.multimodule.model.Data085
import com.mokelab.demo.multimodule.model.Data086
import com.mokelab.demo.multimodule.model.Data087
import com.mokelab.demo.multimodule.model.Data088
import com.mokelab.demo.multimodule.model.Data089
import com.mokelab.demo.multimodule.model.Data090

import javax.inject.Inject

class Data909RepositoryImpl @Inject constructor(): Data909Repository {

    override fun get1(): Data081 {
        println("Debug log")
        println("Generate Data081")
        return Data081(id = 1) 
    }

    override fun get2(): Data082 {
        println("Debug log")
        println("Generate Data082")
        return Data082(id = 1) 
    }

    override fun get3(): Data083 {
        println("Debug log")
        println("Generate Data083")
        return Data083(id = 1) 
    }

    override fun get4(): Data084 {
        println("Debug log")
        println("Generate Data084")
        return Data084(id = 1) 
    }

    override fun get5(): Data085 {
        println("Debug log")
        println("Generate Data085")
        return Data085(id = 1) 
    }

    override fun get6(): Data086 {
        println("Debug log")
        println("Generate Data086")
        return Data086(id = 1) 
    }

    override fun get7(): Data087 {
        println("Debug log")
        println("Generate Data087")
        return Data087(id = 1) 
    }

    override fun get8(): Data088 {
        println("Debug log")
        println("Generate Data088")
        return Data088(id = 1) 
    }

    override fun get9(): Data089 {
        println("Debug log")
        println("Generate Data089")
        return Data089(id = 1) 
    }

    override fun get10(): Data090 {
        println("Debug log")
        println("Generate Data090")
        return Data090(id = 1) 
    }

}
