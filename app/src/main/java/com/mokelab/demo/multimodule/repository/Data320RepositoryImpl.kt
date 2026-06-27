package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data191
import com.mokelab.demo.multimodule.core.model.Data192
import com.mokelab.demo.multimodule.core.model.Data193
import com.mokelab.demo.multimodule.core.model.Data194
import com.mokelab.demo.multimodule.core.model.Data195
import com.mokelab.demo.multimodule.core.model.Data196
import com.mokelab.demo.multimodule.core.model.Data197
import com.mokelab.demo.multimodule.core.model.Data198
import com.mokelab.demo.multimodule.core.model.Data199
import com.mokelab.demo.multimodule.core.model.Data200

import javax.inject.Inject

class Data320RepositoryImpl @Inject constructor(): Data320Repository {

    override fun get1(): Data191 {
        println("Debug log")
        println("Generate Data191")
        return Data191(id = 1) 
    }

    override fun get2(): Data192 {
        println("Debug log")
        println("Generate Data192")
        return Data192(id = 1) 
    }

    override fun get3(): Data193 {
        println("Debug log")
        println("Generate Data193")
        return Data193(id = 1) 
    }

    override fun get4(): Data194 {
        println("Debug log")
        println("Generate Data194")
        return Data194(id = 1) 
    }

    override fun get5(): Data195 {
        println("Debug log")
        println("Generate Data195")
        return Data195(id = 1) 
    }

    override fun get6(): Data196 {
        println("Debug log")
        println("Generate Data196")
        return Data196(id = 1) 
    }

    override fun get7(): Data197 {
        println("Debug log")
        println("Generate Data197")
        return Data197(id = 1) 
    }

    override fun get8(): Data198 {
        println("Debug log")
        println("Generate Data198")
        return Data198(id = 1) 
    }

    override fun get9(): Data199 {
        println("Debug log")
        println("Generate Data199")
        return Data199(id = 1) 
    }

    override fun get10(): Data200 {
        println("Debug log")
        println("Generate Data200")
        return Data200(id = 1) 
    }

}
