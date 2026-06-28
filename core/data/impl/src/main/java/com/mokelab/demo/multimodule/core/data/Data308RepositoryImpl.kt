package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data071
import com.mokelab.demo.multimodule.core.model.Data072
import com.mokelab.demo.multimodule.core.model.Data073
import com.mokelab.demo.multimodule.core.model.Data074
import com.mokelab.demo.multimodule.core.model.Data075
import com.mokelab.demo.multimodule.core.model.Data076
import com.mokelab.demo.multimodule.core.model.Data077
import com.mokelab.demo.multimodule.core.model.Data078
import com.mokelab.demo.multimodule.core.model.Data079
import com.mokelab.demo.multimodule.core.model.Data080

import javax.inject.Inject

class Data308RepositoryImpl @Inject constructor(): Data308Repository {

    override fun get1(): Data071 {
        println("Debug log")
        println("Generate Data071")
        return Data071(id = 1) 
    }

    override fun get2(): Data072 {
        println("Debug log")
        println("Generate Data072")
        return Data072(id = 1) 
    }

    override fun get3(): Data073 {
        println("Debug log")
        println("Generate Data073")
        return Data073(id = 1) 
    }

    override fun get4(): Data074 {
        println("Debug log")
        println("Generate Data074")
        return Data074(id = 1) 
    }

    override fun get5(): Data075 {
        println("Debug log")
        println("Generate Data075")
        return Data075(id = 1) 
    }

    override fun get6(): Data076 {
        println("Debug log")
        println("Generate Data076")
        return Data076(id = 1) 
    }

    override fun get7(): Data077 {
        println("Debug log")
        println("Generate Data077")
        return Data077(id = 1) 
    }

    override fun get8(): Data078 {
        println("Debug log")
        println("Generate Data078")
        return Data078(id = 1) 
    }

    override fun get9(): Data079 {
        println("Debug log")
        println("Generate Data079")
        return Data079(id = 1) 
    }

    override fun get10(): Data080 {
        println("Debug log")
        println("Generate Data080")
        return Data080(id = 1) 
    }

}
