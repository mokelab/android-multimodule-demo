package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data721
import com.mokelab.demo.multimodule.model.Data722
import com.mokelab.demo.multimodule.model.Data723
import com.mokelab.demo.multimodule.model.Data724
import com.mokelab.demo.multimodule.model.Data725
import com.mokelab.demo.multimodule.model.Data726
import com.mokelab.demo.multimodule.model.Data727
import com.mokelab.demo.multimodule.model.Data728
import com.mokelab.demo.multimodule.model.Data729
import com.mokelab.demo.multimodule.model.Data730

import javax.inject.Inject

class Data573RepositoryImpl @Inject constructor(): Data573Repository {

    override fun get1(): Data721 {
        println("Debug log")
        println("Generate Data721")
        return Data721(id = 1) 
    }

    override fun get2(): Data722 {
        println("Debug log")
        println("Generate Data722")
        return Data722(id = 1) 
    }

    override fun get3(): Data723 {
        println("Debug log")
        println("Generate Data723")
        return Data723(id = 1) 
    }

    override fun get4(): Data724 {
        println("Debug log")
        println("Generate Data724")
        return Data724(id = 1) 
    }

    override fun get5(): Data725 {
        println("Debug log")
        println("Generate Data725")
        return Data725(id = 1) 
    }

    override fun get6(): Data726 {
        println("Debug log")
        println("Generate Data726")
        return Data726(id = 1) 
    }

    override fun get7(): Data727 {
        println("Debug log")
        println("Generate Data727")
        return Data727(id = 1) 
    }

    override fun get8(): Data728 {
        println("Debug log")
        println("Generate Data728")
        return Data728(id = 1) 
    }

    override fun get9(): Data729 {
        println("Debug log")
        println("Generate Data729")
        return Data729(id = 1) 
    }

    override fun get10(): Data730 {
        println("Debug log")
        println("Generate Data730")
        return Data730(id = 1) 
    }

}
