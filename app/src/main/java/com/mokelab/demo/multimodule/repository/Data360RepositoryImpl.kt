package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data591
import com.mokelab.demo.multimodule.model.Data592
import com.mokelab.demo.multimodule.model.Data593
import com.mokelab.demo.multimodule.model.Data594
import com.mokelab.demo.multimodule.model.Data595
import com.mokelab.demo.multimodule.model.Data596
import com.mokelab.demo.multimodule.model.Data597
import com.mokelab.demo.multimodule.model.Data598
import com.mokelab.demo.multimodule.model.Data599
import com.mokelab.demo.multimodule.model.Data600

import javax.inject.Inject

class Data360RepositoryImpl @Inject constructor(): Data360Repository {

    override fun get1(): Data591 {
        println("Debug log")
        println("Generate Data591")
        return Data591(id = 1) 
    }

    override fun get2(): Data592 {
        println("Debug log")
        println("Generate Data592")
        return Data592(id = 1) 
    }

    override fun get3(): Data593 {
        println("Debug log")
        println("Generate Data593")
        return Data593(id = 1) 
    }

    override fun get4(): Data594 {
        println("Debug log")
        println("Generate Data594")
        return Data594(id = 1) 
    }

    override fun get5(): Data595 {
        println("Debug log")
        println("Generate Data595")
        return Data595(id = 1) 
    }

    override fun get6(): Data596 {
        println("Debug log")
        println("Generate Data596")
        return Data596(id = 1) 
    }

    override fun get7(): Data597 {
        println("Debug log")
        println("Generate Data597")
        return Data597(id = 1) 
    }

    override fun get8(): Data598 {
        println("Debug log")
        println("Generate Data598")
        return Data598(id = 1) 
    }

    override fun get9(): Data599 {
        println("Debug log")
        println("Generate Data599")
        return Data599(id = 1) 
    }

    override fun get10(): Data600 {
        println("Debug log")
        println("Generate Data600")
        return Data600(id = 1) 
    }

}
