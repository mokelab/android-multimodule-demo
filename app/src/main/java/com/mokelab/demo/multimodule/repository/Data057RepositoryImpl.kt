package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data561
import com.mokelab.demo.multimodule.model.Data562
import com.mokelab.demo.multimodule.model.Data563
import com.mokelab.demo.multimodule.model.Data564
import com.mokelab.demo.multimodule.model.Data565
import com.mokelab.demo.multimodule.model.Data566
import com.mokelab.demo.multimodule.model.Data567
import com.mokelab.demo.multimodule.model.Data568
import com.mokelab.demo.multimodule.model.Data569
import com.mokelab.demo.multimodule.model.Data570

import javax.inject.Inject

class Data057RepositoryImpl @Inject constructor(): Data057Repository {

    override fun get1(): Data561 {
        println("Debug log")
        println("Generate Data561")
        return Data561(id = 1) 
    }

    override fun get2(): Data562 {
        println("Debug log")
        println("Generate Data562")
        return Data562(id = 1) 
    }

    override fun get3(): Data563 {
        println("Debug log")
        println("Generate Data563")
        return Data563(id = 1) 
    }

    override fun get4(): Data564 {
        println("Debug log")
        println("Generate Data564")
        return Data564(id = 1) 
    }

    override fun get5(): Data565 {
        println("Debug log")
        println("Generate Data565")
        return Data565(id = 1) 
    }

    override fun get6(): Data566 {
        println("Debug log")
        println("Generate Data566")
        return Data566(id = 1) 
    }

    override fun get7(): Data567 {
        println("Debug log")
        println("Generate Data567")
        return Data567(id = 1) 
    }

    override fun get8(): Data568 {
        println("Debug log")
        println("Generate Data568")
        return Data568(id = 1) 
    }

    override fun get9(): Data569 {
        println("Debug log")
        println("Generate Data569")
        return Data569(id = 1) 
    }

    override fun get10(): Data570 {
        println("Debug log")
        println("Generate Data570")
        return Data570(id = 1) 
    }

}
