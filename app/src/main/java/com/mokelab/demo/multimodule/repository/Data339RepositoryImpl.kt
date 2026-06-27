package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data381
import com.mokelab.demo.multimodule.model.Data382
import com.mokelab.demo.multimodule.model.Data383
import com.mokelab.demo.multimodule.model.Data384
import com.mokelab.demo.multimodule.model.Data385
import com.mokelab.demo.multimodule.model.Data386
import com.mokelab.demo.multimodule.model.Data387
import com.mokelab.demo.multimodule.model.Data388
import com.mokelab.demo.multimodule.model.Data389
import com.mokelab.demo.multimodule.model.Data390

import javax.inject.Inject

class Data339RepositoryImpl @Inject constructor(): Data339Repository {

    override fun get1(): Data381 {
        println("Debug log")
        println("Generate Data381")
        return Data381(id = 1) 
    }

    override fun get2(): Data382 {
        println("Debug log")
        println("Generate Data382")
        return Data382(id = 1) 
    }

    override fun get3(): Data383 {
        println("Debug log")
        println("Generate Data383")
        return Data383(id = 1) 
    }

    override fun get4(): Data384 {
        println("Debug log")
        println("Generate Data384")
        return Data384(id = 1) 
    }

    override fun get5(): Data385 {
        println("Debug log")
        println("Generate Data385")
        return Data385(id = 1) 
    }

    override fun get6(): Data386 {
        println("Debug log")
        println("Generate Data386")
        return Data386(id = 1) 
    }

    override fun get7(): Data387 {
        println("Debug log")
        println("Generate Data387")
        return Data387(id = 1) 
    }

    override fun get8(): Data388 {
        println("Debug log")
        println("Generate Data388")
        return Data388(id = 1) 
    }

    override fun get9(): Data389 {
        println("Debug log")
        println("Generate Data389")
        return Data389(id = 1) 
    }

    override fun get10(): Data390 {
        println("Debug log")
        println("Generate Data390")
        return Data390(id = 1) 
    }

}
