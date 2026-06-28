package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data821
import com.mokelab.demo.multimodule.core.model.Data822
import com.mokelab.demo.multimodule.core.model.Data823
import com.mokelab.demo.multimodule.core.model.Data824
import com.mokelab.demo.multimodule.core.model.Data825
import com.mokelab.demo.multimodule.core.model.Data826
import com.mokelab.demo.multimodule.core.model.Data827
import com.mokelab.demo.multimodule.core.model.Data828
import com.mokelab.demo.multimodule.core.model.Data829
import com.mokelab.demo.multimodule.core.model.Data830

import javax.inject.Inject

class Data083RepositoryImpl @Inject constructor(): Data083Repository {

    override fun get1(): Data821 {
        println("Debug log")
        println("Generate Data821")
        return Data821(id = 1) 
    }

    override fun get2(): Data822 {
        println("Debug log")
        println("Generate Data822")
        return Data822(id = 1) 
    }

    override fun get3(): Data823 {
        println("Debug log")
        println("Generate Data823")
        return Data823(id = 1) 
    }

    override fun get4(): Data824 {
        println("Debug log")
        println("Generate Data824")
        return Data824(id = 1) 
    }

    override fun get5(): Data825 {
        println("Debug log")
        println("Generate Data825")
        return Data825(id = 1) 
    }

    override fun get6(): Data826 {
        println("Debug log")
        println("Generate Data826")
        return Data826(id = 1) 
    }

    override fun get7(): Data827 {
        println("Debug log")
        println("Generate Data827")
        return Data827(id = 1) 
    }

    override fun get8(): Data828 {
        println("Debug log")
        println("Generate Data828")
        return Data828(id = 1) 
    }

    override fun get9(): Data829 {
        println("Debug log")
        println("Generate Data829")
        return Data829(id = 1) 
    }

    override fun get10(): Data830 {
        println("Debug log")
        println("Generate Data830")
        return Data830(id = 1) 
    }

}
