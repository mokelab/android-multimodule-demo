package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data011
import com.mokelab.demo.multimodule.core.model.Data012
import com.mokelab.demo.multimodule.core.model.Data013
import com.mokelab.demo.multimodule.core.model.Data014
import com.mokelab.demo.multimodule.core.model.Data015
import com.mokelab.demo.multimodule.core.model.Data016
import com.mokelab.demo.multimodule.core.model.Data017
import com.mokelab.demo.multimodule.core.model.Data018
import com.mokelab.demo.multimodule.core.model.Data019
import com.mokelab.demo.multimodule.core.model.Data020

import javax.inject.Inject

class Data102RepositoryImpl @Inject constructor(): Data102Repository {

    override fun get1(): Data011 {
        println("Debug log")
        println("Generate Data011")
        return Data011(id = 1) 
    }

    override fun get2(): Data012 {
        println("Debug log")
        println("Generate Data012")
        return Data012(id = 1) 
    }

    override fun get3(): Data013 {
        println("Debug log")
        println("Generate Data013")
        return Data013(id = 1) 
    }

    override fun get4(): Data014 {
        println("Debug log")
        println("Generate Data014")
        return Data014(id = 1) 
    }

    override fun get5(): Data015 {
        println("Debug log")
        println("Generate Data015")
        return Data015(id = 1) 
    }

    override fun get6(): Data016 {
        println("Debug log")
        println("Generate Data016")
        return Data016(id = 1) 
    }

    override fun get7(): Data017 {
        println("Debug log")
        println("Generate Data017")
        return Data017(id = 1) 
    }

    override fun get8(): Data018 {
        println("Debug log")
        println("Generate Data018")
        return Data018(id = 1) 
    }

    override fun get9(): Data019 {
        println("Debug log")
        println("Generate Data019")
        return Data019(id = 1) 
    }

    override fun get10(): Data020 {
        println("Debug log")
        println("Generate Data020")
        return Data020(id = 1) 
    }

}
