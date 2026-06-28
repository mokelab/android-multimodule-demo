package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data221
import com.mokelab.demo.multimodule.core.model.Data222
import com.mokelab.demo.multimodule.core.model.Data223
import com.mokelab.demo.multimodule.core.model.Data224
import com.mokelab.demo.multimodule.core.model.Data225
import com.mokelab.demo.multimodule.core.model.Data226
import com.mokelab.demo.multimodule.core.model.Data227
import com.mokelab.demo.multimodule.core.model.Data228
import com.mokelab.demo.multimodule.core.model.Data229
import com.mokelab.demo.multimodule.core.model.Data230

import javax.inject.Inject

class Data523RepositoryImpl @Inject constructor(): Data523Repository {

    override fun get1(): Data221 {
        println("Debug log")
        println("Generate Data221")
        return Data221(id = 1) 
    }

    override fun get2(): Data222 {
        println("Debug log")
        println("Generate Data222")
        return Data222(id = 1) 
    }

    override fun get3(): Data223 {
        println("Debug log")
        println("Generate Data223")
        return Data223(id = 1) 
    }

    override fun get4(): Data224 {
        println("Debug log")
        println("Generate Data224")
        return Data224(id = 1) 
    }

    override fun get5(): Data225 {
        println("Debug log")
        println("Generate Data225")
        return Data225(id = 1) 
    }

    override fun get6(): Data226 {
        println("Debug log")
        println("Generate Data226")
        return Data226(id = 1) 
    }

    override fun get7(): Data227 {
        println("Debug log")
        println("Generate Data227")
        return Data227(id = 1) 
    }

    override fun get8(): Data228 {
        println("Debug log")
        println("Generate Data228")
        return Data228(id = 1) 
    }

    override fun get9(): Data229 {
        println("Debug log")
        println("Generate Data229")
        return Data229(id = 1) 
    }

    override fun get10(): Data230 {
        println("Debug log")
        println("Generate Data230")
        return Data230(id = 1) 
    }

}
