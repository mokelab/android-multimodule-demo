package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data401
import com.mokelab.demo.multimodule.core.model.Data402
import com.mokelab.demo.multimodule.core.model.Data403
import com.mokelab.demo.multimodule.core.model.Data404
import com.mokelab.demo.multimodule.core.model.Data405
import com.mokelab.demo.multimodule.core.model.Data406
import com.mokelab.demo.multimodule.core.model.Data407
import com.mokelab.demo.multimodule.core.model.Data408
import com.mokelab.demo.multimodule.core.model.Data409
import com.mokelab.demo.multimodule.core.model.Data410

import javax.inject.Inject

class Data541RepositoryImpl @Inject constructor(): Data541Repository {

    override fun get1(): Data401 {
        println("Debug log")
        println("Generate Data401")
        return Data401(id = 1) 
    }

    override fun get2(): Data402 {
        println("Debug log")
        println("Generate Data402")
        return Data402(id = 1) 
    }

    override fun get3(): Data403 {
        println("Debug log")
        println("Generate Data403")
        return Data403(id = 1) 
    }

    override fun get4(): Data404 {
        println("Debug log")
        println("Generate Data404")
        return Data404(id = 1) 
    }

    override fun get5(): Data405 {
        println("Debug log")
        println("Generate Data405")
        return Data405(id = 1) 
    }

    override fun get6(): Data406 {
        println("Debug log")
        println("Generate Data406")
        return Data406(id = 1) 
    }

    override fun get7(): Data407 {
        println("Debug log")
        println("Generate Data407")
        return Data407(id = 1) 
    }

    override fun get8(): Data408 {
        println("Debug log")
        println("Generate Data408")
        return Data408(id = 1) 
    }

    override fun get9(): Data409 {
        println("Debug log")
        println("Generate Data409")
        return Data409(id = 1) 
    }

    override fun get10(): Data410 {
        println("Debug log")
        println("Generate Data410")
        return Data410(id = 1) 
    }

}
