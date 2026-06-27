package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data511
import com.mokelab.demo.multimodule.core.model.Data512
import com.mokelab.demo.multimodule.core.model.Data513
import com.mokelab.demo.multimodule.core.model.Data514
import com.mokelab.demo.multimodule.core.model.Data515
import com.mokelab.demo.multimodule.core.model.Data516
import com.mokelab.demo.multimodule.core.model.Data517
import com.mokelab.demo.multimodule.core.model.Data518
import com.mokelab.demo.multimodule.core.model.Data519
import com.mokelab.demo.multimodule.core.model.Data520

import javax.inject.Inject

class Data652RepositoryImpl @Inject constructor(): Data652Repository {

    override fun get1(): Data511 {
        println("Debug log")
        println("Generate Data511")
        return Data511(id = 1) 
    }

    override fun get2(): Data512 {
        println("Debug log")
        println("Generate Data512")
        return Data512(id = 1) 
    }

    override fun get3(): Data513 {
        println("Debug log")
        println("Generate Data513")
        return Data513(id = 1) 
    }

    override fun get4(): Data514 {
        println("Debug log")
        println("Generate Data514")
        return Data514(id = 1) 
    }

    override fun get5(): Data515 {
        println("Debug log")
        println("Generate Data515")
        return Data515(id = 1) 
    }

    override fun get6(): Data516 {
        println("Debug log")
        println("Generate Data516")
        return Data516(id = 1) 
    }

    override fun get7(): Data517 {
        println("Debug log")
        println("Generate Data517")
        return Data517(id = 1) 
    }

    override fun get8(): Data518 {
        println("Debug log")
        println("Generate Data518")
        return Data518(id = 1) 
    }

    override fun get9(): Data519 {
        println("Debug log")
        println("Generate Data519")
        return Data519(id = 1) 
    }

    override fun get10(): Data520 {
        println("Debug log")
        println("Generate Data520")
        return Data520(id = 1) 
    }

}
