package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data051
import com.mokelab.demo.multimodule.core.model.Data052
import com.mokelab.demo.multimodule.core.model.Data053
import com.mokelab.demo.multimodule.core.model.Data054
import com.mokelab.demo.multimodule.core.model.Data055
import com.mokelab.demo.multimodule.core.model.Data056
import com.mokelab.demo.multimodule.core.model.Data057
import com.mokelab.demo.multimodule.core.model.Data058
import com.mokelab.demo.multimodule.core.model.Data059
import com.mokelab.demo.multimodule.core.model.Data060

import javax.inject.Inject

class Data206RepositoryImpl @Inject constructor(): Data206Repository {

    override fun get1(): Data051 {
        println("Debug log")
        println("Generate Data051")
        return Data051(id = 1) 
    }

    override fun get2(): Data052 {
        println("Debug log")
        println("Generate Data052")
        return Data052(id = 1) 
    }

    override fun get3(): Data053 {
        println("Debug log")
        println("Generate Data053")
        return Data053(id = 1) 
    }

    override fun get4(): Data054 {
        println("Debug log")
        println("Generate Data054")
        return Data054(id = 1) 
    }

    override fun get5(): Data055 {
        println("Debug log")
        println("Generate Data055")
        return Data055(id = 1) 
    }

    override fun get6(): Data056 {
        println("Debug log")
        println("Generate Data056")
        return Data056(id = 1) 
    }

    override fun get7(): Data057 {
        println("Debug log")
        println("Generate Data057")
        return Data057(id = 1) 
    }

    override fun get8(): Data058 {
        println("Debug log")
        println("Generate Data058")
        return Data058(id = 1) 
    }

    override fun get9(): Data059 {
        println("Debug log")
        println("Generate Data059")
        return Data059(id = 1) 
    }

    override fun get10(): Data060 {
        println("Debug log")
        println("Generate Data060")
        return Data060(id = 1) 
    }

}
