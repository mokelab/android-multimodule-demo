package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data021
import com.mokelab.demo.multimodule.core.model.Data022
import com.mokelab.demo.multimodule.core.model.Data023
import com.mokelab.demo.multimodule.core.model.Data024
import com.mokelab.demo.multimodule.core.model.Data025
import com.mokelab.demo.multimodule.core.model.Data026
import com.mokelab.demo.multimodule.core.model.Data027
import com.mokelab.demo.multimodule.core.model.Data028
import com.mokelab.demo.multimodule.core.model.Data029
import com.mokelab.demo.multimodule.core.model.Data030

import javax.inject.Inject

class Data703RepositoryImpl @Inject constructor(): Data703Repository {

    override fun get1(): Data021 {
        println("Debug log")
        println("Generate Data021")
        return Data021(id = 1) 
    }

    override fun get2(): Data022 {
        println("Debug log")
        println("Generate Data022")
        return Data022(id = 1) 
    }

    override fun get3(): Data023 {
        println("Debug log")
        println("Generate Data023")
        return Data023(id = 1) 
    }

    override fun get4(): Data024 {
        println("Debug log")
        println("Generate Data024")
        return Data024(id = 1) 
    }

    override fun get5(): Data025 {
        println("Debug log")
        println("Generate Data025")
        return Data025(id = 1) 
    }

    override fun get6(): Data026 {
        println("Debug log")
        println("Generate Data026")
        return Data026(id = 1) 
    }

    override fun get7(): Data027 {
        println("Debug log")
        println("Generate Data027")
        return Data027(id = 1) 
    }

    override fun get8(): Data028 {
        println("Debug log")
        println("Generate Data028")
        return Data028(id = 1) 
    }

    override fun get9(): Data029 {
        println("Debug log")
        println("Generate Data029")
        return Data029(id = 1) 
    }

    override fun get10(): Data030 {
        println("Debug log")
        println("Generate Data030")
        return Data030(id = 1) 
    }

}
