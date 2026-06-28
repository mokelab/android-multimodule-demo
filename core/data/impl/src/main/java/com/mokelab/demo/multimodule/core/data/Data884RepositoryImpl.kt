package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data831
import com.mokelab.demo.multimodule.core.model.Data832
import com.mokelab.demo.multimodule.core.model.Data833
import com.mokelab.demo.multimodule.core.model.Data834
import com.mokelab.demo.multimodule.core.model.Data835
import com.mokelab.demo.multimodule.core.model.Data836
import com.mokelab.demo.multimodule.core.model.Data837
import com.mokelab.demo.multimodule.core.model.Data838
import com.mokelab.demo.multimodule.core.model.Data839
import com.mokelab.demo.multimodule.core.model.Data840

import javax.inject.Inject

class Data884RepositoryImpl @Inject constructor(): Data884Repository {

    override fun get1(): Data831 {
        println("Debug log")
        println("Generate Data831")
        return Data831(id = 1) 
    }

    override fun get2(): Data832 {
        println("Debug log")
        println("Generate Data832")
        return Data832(id = 1) 
    }

    override fun get3(): Data833 {
        println("Debug log")
        println("Generate Data833")
        return Data833(id = 1) 
    }

    override fun get4(): Data834 {
        println("Debug log")
        println("Generate Data834")
        return Data834(id = 1) 
    }

    override fun get5(): Data835 {
        println("Debug log")
        println("Generate Data835")
        return Data835(id = 1) 
    }

    override fun get6(): Data836 {
        println("Debug log")
        println("Generate Data836")
        return Data836(id = 1) 
    }

    override fun get7(): Data837 {
        println("Debug log")
        println("Generate Data837")
        return Data837(id = 1) 
    }

    override fun get8(): Data838 {
        println("Debug log")
        println("Generate Data838")
        return Data838(id = 1) 
    }

    override fun get9(): Data839 {
        println("Debug log")
        println("Generate Data839")
        return Data839(id = 1) 
    }

    override fun get10(): Data840 {
        println("Debug log")
        println("Generate Data840")
        return Data840(id = 1) 
    }

}
