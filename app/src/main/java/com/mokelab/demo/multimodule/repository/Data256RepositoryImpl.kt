package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data551
import com.mokelab.demo.multimodule.core.model.Data552
import com.mokelab.demo.multimodule.core.model.Data553
import com.mokelab.demo.multimodule.core.model.Data554
import com.mokelab.demo.multimodule.core.model.Data555
import com.mokelab.demo.multimodule.core.model.Data556
import com.mokelab.demo.multimodule.core.model.Data557
import com.mokelab.demo.multimodule.core.model.Data558
import com.mokelab.demo.multimodule.core.model.Data559
import com.mokelab.demo.multimodule.core.model.Data560

import javax.inject.Inject

class Data256RepositoryImpl @Inject constructor(): Data256Repository {

    override fun get1(): Data551 {
        println("Debug log")
        println("Generate Data551")
        return Data551(id = 1) 
    }

    override fun get2(): Data552 {
        println("Debug log")
        println("Generate Data552")
        return Data552(id = 1) 
    }

    override fun get3(): Data553 {
        println("Debug log")
        println("Generate Data553")
        return Data553(id = 1) 
    }

    override fun get4(): Data554 {
        println("Debug log")
        println("Generate Data554")
        return Data554(id = 1) 
    }

    override fun get5(): Data555 {
        println("Debug log")
        println("Generate Data555")
        return Data555(id = 1) 
    }

    override fun get6(): Data556 {
        println("Debug log")
        println("Generate Data556")
        return Data556(id = 1) 
    }

    override fun get7(): Data557 {
        println("Debug log")
        println("Generate Data557")
        return Data557(id = 1) 
    }

    override fun get8(): Data558 {
        println("Debug log")
        println("Generate Data558")
        return Data558(id = 1) 
    }

    override fun get9(): Data559 {
        println("Debug log")
        println("Generate Data559")
        return Data559(id = 1) 
    }

    override fun get10(): Data560 {
        println("Debug log")
        println("Generate Data560")
        return Data560(id = 1) 
    }

}
