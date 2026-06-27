package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data901
import com.mokelab.demo.multimodule.core.model.Data902
import com.mokelab.demo.multimodule.core.model.Data903
import com.mokelab.demo.multimodule.core.model.Data904
import com.mokelab.demo.multimodule.core.model.Data905
import com.mokelab.demo.multimodule.core.model.Data906
import com.mokelab.demo.multimodule.core.model.Data907
import com.mokelab.demo.multimodule.core.model.Data908
import com.mokelab.demo.multimodule.core.model.Data909
import com.mokelab.demo.multimodule.core.model.Data910

import javax.inject.Inject

class Data591RepositoryImpl @Inject constructor(): Data591Repository {

    override fun get1(): Data901 {
        println("Debug log")
        println("Generate Data901")
        return Data901(id = 1) 
    }

    override fun get2(): Data902 {
        println("Debug log")
        println("Generate Data902")
        return Data902(id = 1) 
    }

    override fun get3(): Data903 {
        println("Debug log")
        println("Generate Data903")
        return Data903(id = 1) 
    }

    override fun get4(): Data904 {
        println("Debug log")
        println("Generate Data904")
        return Data904(id = 1) 
    }

    override fun get5(): Data905 {
        println("Debug log")
        println("Generate Data905")
        return Data905(id = 1) 
    }

    override fun get6(): Data906 {
        println("Debug log")
        println("Generate Data906")
        return Data906(id = 1) 
    }

    override fun get7(): Data907 {
        println("Debug log")
        println("Generate Data907")
        return Data907(id = 1) 
    }

    override fun get8(): Data908 {
        println("Debug log")
        println("Generate Data908")
        return Data908(id = 1) 
    }

    override fun get9(): Data909 {
        println("Debug log")
        println("Generate Data909")
        return Data909(id = 1) 
    }

    override fun get10(): Data910 {
        println("Debug log")
        println("Generate Data910")
        return Data910(id = 1) 
    }

}
