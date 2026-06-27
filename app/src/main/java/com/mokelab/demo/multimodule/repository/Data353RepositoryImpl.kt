package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data521
import com.mokelab.demo.multimodule.model.Data522
import com.mokelab.demo.multimodule.model.Data523
import com.mokelab.demo.multimodule.model.Data524
import com.mokelab.demo.multimodule.model.Data525
import com.mokelab.demo.multimodule.model.Data526
import com.mokelab.demo.multimodule.model.Data527
import com.mokelab.demo.multimodule.model.Data528
import com.mokelab.demo.multimodule.model.Data529
import com.mokelab.demo.multimodule.model.Data530

import javax.inject.Inject

class Data353RepositoryImpl @Inject constructor(): Data353Repository {

    override fun get1(): Data521 {
        println("Debug log")
        println("Generate Data521")
        return Data521(id = 1) 
    }

    override fun get2(): Data522 {
        println("Debug log")
        println("Generate Data522")
        return Data522(id = 1) 
    }

    override fun get3(): Data523 {
        println("Debug log")
        println("Generate Data523")
        return Data523(id = 1) 
    }

    override fun get4(): Data524 {
        println("Debug log")
        println("Generate Data524")
        return Data524(id = 1) 
    }

    override fun get5(): Data525 {
        println("Debug log")
        println("Generate Data525")
        return Data525(id = 1) 
    }

    override fun get6(): Data526 {
        println("Debug log")
        println("Generate Data526")
        return Data526(id = 1) 
    }

    override fun get7(): Data527 {
        println("Debug log")
        println("Generate Data527")
        return Data527(id = 1) 
    }

    override fun get8(): Data528 {
        println("Debug log")
        println("Generate Data528")
        return Data528(id = 1) 
    }

    override fun get9(): Data529 {
        println("Debug log")
        println("Generate Data529")
        return Data529(id = 1) 
    }

    override fun get10(): Data530 {
        println("Debug log")
        println("Generate Data530")
        return Data530(id = 1) 
    }

}
