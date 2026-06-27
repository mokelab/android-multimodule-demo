package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data421
import com.mokelab.demo.multimodule.model.Data422
import com.mokelab.demo.multimodule.model.Data423
import com.mokelab.demo.multimodule.model.Data424
import com.mokelab.demo.multimodule.model.Data425
import com.mokelab.demo.multimodule.model.Data426
import com.mokelab.demo.multimodule.model.Data427
import com.mokelab.demo.multimodule.model.Data428
import com.mokelab.demo.multimodule.model.Data429
import com.mokelab.demo.multimodule.model.Data430

import javax.inject.Inject

class Data443RepositoryImpl @Inject constructor(): Data443Repository {

    override fun get1(): Data421 {
        println("Debug log")
        println("Generate Data421")
        return Data421(id = 1) 
    }

    override fun get2(): Data422 {
        println("Debug log")
        println("Generate Data422")
        return Data422(id = 1) 
    }

    override fun get3(): Data423 {
        println("Debug log")
        println("Generate Data423")
        return Data423(id = 1) 
    }

    override fun get4(): Data424 {
        println("Debug log")
        println("Generate Data424")
        return Data424(id = 1) 
    }

    override fun get5(): Data425 {
        println("Debug log")
        println("Generate Data425")
        return Data425(id = 1) 
    }

    override fun get6(): Data426 {
        println("Debug log")
        println("Generate Data426")
        return Data426(id = 1) 
    }

    override fun get7(): Data427 {
        println("Debug log")
        println("Generate Data427")
        return Data427(id = 1) 
    }

    override fun get8(): Data428 {
        println("Debug log")
        println("Generate Data428")
        return Data428(id = 1) 
    }

    override fun get9(): Data429 {
        println("Debug log")
        println("Generate Data429")
        return Data429(id = 1) 
    }

    override fun get10(): Data430 {
        println("Debug log")
        println("Generate Data430")
        return Data430(id = 1) 
    }

}
