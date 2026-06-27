package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data121
import com.mokelab.demo.multimodule.model.Data122
import com.mokelab.demo.multimodule.model.Data123
import com.mokelab.demo.multimodule.model.Data124
import com.mokelab.demo.multimodule.model.Data125
import com.mokelab.demo.multimodule.model.Data126
import com.mokelab.demo.multimodule.model.Data127
import com.mokelab.demo.multimodule.model.Data128
import com.mokelab.demo.multimodule.model.Data129
import com.mokelab.demo.multimodule.model.Data130

import javax.inject.Inject

class Data113RepositoryImpl @Inject constructor(): Data113Repository {

    override fun get1(): Data121 {
        println("Debug log")
        println("Generate Data121")
        return Data121(id = 1) 
    }

    override fun get2(): Data122 {
        println("Debug log")
        println("Generate Data122")
        return Data122(id = 1) 
    }

    override fun get3(): Data123 {
        println("Debug log")
        println("Generate Data123")
        return Data123(id = 1) 
    }

    override fun get4(): Data124 {
        println("Debug log")
        println("Generate Data124")
        return Data124(id = 1) 
    }

    override fun get5(): Data125 {
        println("Debug log")
        println("Generate Data125")
        return Data125(id = 1) 
    }

    override fun get6(): Data126 {
        println("Debug log")
        println("Generate Data126")
        return Data126(id = 1) 
    }

    override fun get7(): Data127 {
        println("Debug log")
        println("Generate Data127")
        return Data127(id = 1) 
    }

    override fun get8(): Data128 {
        println("Debug log")
        println("Generate Data128")
        return Data128(id = 1) 
    }

    override fun get9(): Data129 {
        println("Debug log")
        println("Generate Data129")
        return Data129(id = 1) 
    }

    override fun get10(): Data130 {
        println("Debug log")
        println("Generate Data130")
        return Data130(id = 1) 
    }

}
