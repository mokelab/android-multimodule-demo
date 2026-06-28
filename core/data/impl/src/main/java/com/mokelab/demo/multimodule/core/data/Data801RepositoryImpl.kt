package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data001
import com.mokelab.demo.multimodule.core.model.Data002
import com.mokelab.demo.multimodule.core.model.Data003
import com.mokelab.demo.multimodule.core.model.Data004
import com.mokelab.demo.multimodule.core.model.Data005
import com.mokelab.demo.multimodule.core.model.Data006
import com.mokelab.demo.multimodule.core.model.Data007
import com.mokelab.demo.multimodule.core.model.Data008
import com.mokelab.demo.multimodule.core.model.Data009
import com.mokelab.demo.multimodule.core.model.Data010

import javax.inject.Inject

class Data801RepositoryImpl @Inject constructor(): Data801Repository {

    override fun get1(): Data001 {
        println("Debug log")
        println("Generate Data001")
        return Data001(id = 1) 
    }

    override fun get2(): Data002 {
        println("Debug log")
        println("Generate Data002")
        return Data002(id = 1) 
    }

    override fun get3(): Data003 {
        println("Debug log")
        println("Generate Data003")
        return Data003(id = 1) 
    }

    override fun get4(): Data004 {
        println("Debug log")
        println("Generate Data004")
        return Data004(id = 1) 
    }

    override fun get5(): Data005 {
        println("Debug log")
        println("Generate Data005")
        return Data005(id = 1) 
    }

    override fun get6(): Data006 {
        println("Debug log")
        println("Generate Data006")
        return Data006(id = 1) 
    }

    override fun get7(): Data007 {
        println("Debug log")
        println("Generate Data007")
        return Data007(id = 1) 
    }

    override fun get8(): Data008 {
        println("Debug log")
        println("Generate Data008")
        return Data008(id = 1) 
    }

    override fun get9(): Data009 {
        println("Debug log")
        println("Generate Data009")
        return Data009(id = 1) 
    }

    override fun get10(): Data010 {
        println("Debug log")
        println("Generate Data010")
        return Data010(id = 1) 
    }

}
