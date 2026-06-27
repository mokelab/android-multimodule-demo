package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data991
import com.mokelab.demo.multimodule.core.model.Data992
import com.mokelab.demo.multimodule.core.model.Data993
import com.mokelab.demo.multimodule.core.model.Data994
import com.mokelab.demo.multimodule.core.model.Data995
import com.mokelab.demo.multimodule.core.model.Data996
import com.mokelab.demo.multimodule.core.model.Data997
import com.mokelab.demo.multimodule.core.model.Data998
import com.mokelab.demo.multimodule.core.model.Data999
import com.mokelab.demo.multimodule.core.model.Data000

import javax.inject.Inject

class Data900RepositoryImpl @Inject constructor(): Data900Repository {

    override fun get1(): Data991 {
        println("Debug log")
        println("Generate Data991")
        return Data991(id = 1) 
    }

    override fun get2(): Data992 {
        println("Debug log")
        println("Generate Data992")
        return Data992(id = 1) 
    }

    override fun get3(): Data993 {
        println("Debug log")
        println("Generate Data993")
        return Data993(id = 1) 
    }

    override fun get4(): Data994 {
        println("Debug log")
        println("Generate Data994")
        return Data994(id = 1) 
    }

    override fun get5(): Data995 {
        println("Debug log")
        println("Generate Data995")
        return Data995(id = 1) 
    }

    override fun get6(): Data996 {
        println("Debug log")
        println("Generate Data996")
        return Data996(id = 1) 
    }

    override fun get7(): Data997 {
        println("Debug log")
        println("Generate Data997")
        return Data997(id = 1) 
    }

    override fun get8(): Data998 {
        println("Debug log")
        println("Generate Data998")
        return Data998(id = 1) 
    }

    override fun get9(): Data999 {
        println("Debug log")
        println("Generate Data999")
        return Data999(id = 1) 
    }

    override fun get10(): Data000 {
        println("Debug log")
        println("Generate Data000")
        return Data000(id = 1) 
    }

}
