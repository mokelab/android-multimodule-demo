package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data711
import com.mokelab.demo.multimodule.model.Data712
import com.mokelab.demo.multimodule.model.Data713
import com.mokelab.demo.multimodule.model.Data714
import com.mokelab.demo.multimodule.model.Data715
import com.mokelab.demo.multimodule.model.Data716
import com.mokelab.demo.multimodule.model.Data717
import com.mokelab.demo.multimodule.model.Data718
import com.mokelab.demo.multimodule.model.Data719
import com.mokelab.demo.multimodule.model.Data720

import javax.inject.Inject

class Data172RepositoryImpl @Inject constructor(): Data172Repository {

    override fun get1(): Data711 {
        println("Debug log")
        println("Generate Data711")
        return Data711(id = 1) 
    }

    override fun get2(): Data712 {
        println("Debug log")
        println("Generate Data712")
        return Data712(id = 1) 
    }

    override fun get3(): Data713 {
        println("Debug log")
        println("Generate Data713")
        return Data713(id = 1) 
    }

    override fun get4(): Data714 {
        println("Debug log")
        println("Generate Data714")
        return Data714(id = 1) 
    }

    override fun get5(): Data715 {
        println("Debug log")
        println("Generate Data715")
        return Data715(id = 1) 
    }

    override fun get6(): Data716 {
        println("Debug log")
        println("Generate Data716")
        return Data716(id = 1) 
    }

    override fun get7(): Data717 {
        println("Debug log")
        println("Generate Data717")
        return Data717(id = 1) 
    }

    override fun get8(): Data718 {
        println("Debug log")
        println("Generate Data718")
        return Data718(id = 1) 
    }

    override fun get9(): Data719 {
        println("Debug log")
        println("Generate Data719")
        return Data719(id = 1) 
    }

    override fun get10(): Data720 {
        println("Debug log")
        println("Generate Data720")
        return Data720(id = 1) 
    }

}
