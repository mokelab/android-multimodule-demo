package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data601
import com.mokelab.demo.multimodule.core.model.Data602
import com.mokelab.demo.multimodule.core.model.Data603
import com.mokelab.demo.multimodule.core.model.Data604
import com.mokelab.demo.multimodule.core.model.Data605
import com.mokelab.demo.multimodule.core.model.Data606
import com.mokelab.demo.multimodule.core.model.Data607
import com.mokelab.demo.multimodule.core.model.Data608
import com.mokelab.demo.multimodule.core.model.Data609
import com.mokelab.demo.multimodule.core.model.Data610

import javax.inject.Inject

class Data761RepositoryImpl @Inject constructor(): Data761Repository {

    override fun get1(): Data601 {
        println("Debug log")
        println("Generate Data601")
        return Data601(id = 1) 
    }

    override fun get2(): Data602 {
        println("Debug log")
        println("Generate Data602")
        return Data602(id = 1) 
    }

    override fun get3(): Data603 {
        println("Debug log")
        println("Generate Data603")
        return Data603(id = 1) 
    }

    override fun get4(): Data604 {
        println("Debug log")
        println("Generate Data604")
        return Data604(id = 1) 
    }

    override fun get5(): Data605 {
        println("Debug log")
        println("Generate Data605")
        return Data605(id = 1) 
    }

    override fun get6(): Data606 {
        println("Debug log")
        println("Generate Data606")
        return Data606(id = 1) 
    }

    override fun get7(): Data607 {
        println("Debug log")
        println("Generate Data607")
        return Data607(id = 1) 
    }

    override fun get8(): Data608 {
        println("Debug log")
        println("Generate Data608")
        return Data608(id = 1) 
    }

    override fun get9(): Data609 {
        println("Debug log")
        println("Generate Data609")
        return Data609(id = 1) 
    }

    override fun get10(): Data610 {
        println("Debug log")
        println("Generate Data610")
        return Data610(id = 1) 
    }

}
