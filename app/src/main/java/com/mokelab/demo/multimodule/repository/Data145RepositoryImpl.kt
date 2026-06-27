package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data441
import com.mokelab.demo.multimodule.model.Data442
import com.mokelab.demo.multimodule.model.Data443
import com.mokelab.demo.multimodule.model.Data444
import com.mokelab.demo.multimodule.model.Data445
import com.mokelab.demo.multimodule.model.Data446
import com.mokelab.demo.multimodule.model.Data447
import com.mokelab.demo.multimodule.model.Data448
import com.mokelab.demo.multimodule.model.Data449
import com.mokelab.demo.multimodule.model.Data450

import javax.inject.Inject

class Data145RepositoryImpl @Inject constructor(): Data145Repository {

    override fun get1(): Data441 {
        println("Debug log")
        println("Generate Data441")
        return Data441(id = 1) 
    }

    override fun get2(): Data442 {
        println("Debug log")
        println("Generate Data442")
        return Data442(id = 1) 
    }

    override fun get3(): Data443 {
        println("Debug log")
        println("Generate Data443")
        return Data443(id = 1) 
    }

    override fun get4(): Data444 {
        println("Debug log")
        println("Generate Data444")
        return Data444(id = 1) 
    }

    override fun get5(): Data445 {
        println("Debug log")
        println("Generate Data445")
        return Data445(id = 1) 
    }

    override fun get6(): Data446 {
        println("Debug log")
        println("Generate Data446")
        return Data446(id = 1) 
    }

    override fun get7(): Data447 {
        println("Debug log")
        println("Generate Data447")
        return Data447(id = 1) 
    }

    override fun get8(): Data448 {
        println("Debug log")
        println("Generate Data448")
        return Data448(id = 1) 
    }

    override fun get9(): Data449 {
        println("Debug log")
        println("Generate Data449")
        return Data449(id = 1) 
    }

    override fun get10(): Data450 {
        println("Debug log")
        println("Generate Data450")
        return Data450(id = 1) 
    }

}
