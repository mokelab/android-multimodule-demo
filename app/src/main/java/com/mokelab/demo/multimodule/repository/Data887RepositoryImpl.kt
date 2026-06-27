package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data861
import com.mokelab.demo.multimodule.model.Data862
import com.mokelab.demo.multimodule.model.Data863
import com.mokelab.demo.multimodule.model.Data864
import com.mokelab.demo.multimodule.model.Data865
import com.mokelab.demo.multimodule.model.Data866
import com.mokelab.demo.multimodule.model.Data867
import com.mokelab.demo.multimodule.model.Data868
import com.mokelab.demo.multimodule.model.Data869
import com.mokelab.demo.multimodule.model.Data870

import javax.inject.Inject

class Data887RepositoryImpl @Inject constructor(): Data887Repository {

    override fun get1(): Data861 {
        println("Debug log")
        println("Generate Data861")
        return Data861(id = 1) 
    }

    override fun get2(): Data862 {
        println("Debug log")
        println("Generate Data862")
        return Data862(id = 1) 
    }

    override fun get3(): Data863 {
        println("Debug log")
        println("Generate Data863")
        return Data863(id = 1) 
    }

    override fun get4(): Data864 {
        println("Debug log")
        println("Generate Data864")
        return Data864(id = 1) 
    }

    override fun get5(): Data865 {
        println("Debug log")
        println("Generate Data865")
        return Data865(id = 1) 
    }

    override fun get6(): Data866 {
        println("Debug log")
        println("Generate Data866")
        return Data866(id = 1) 
    }

    override fun get7(): Data867 {
        println("Debug log")
        println("Generate Data867")
        return Data867(id = 1) 
    }

    override fun get8(): Data868 {
        println("Debug log")
        println("Generate Data868")
        return Data868(id = 1) 
    }

    override fun get9(): Data869 {
        println("Debug log")
        println("Generate Data869")
        return Data869(id = 1) 
    }

    override fun get10(): Data870 {
        println("Debug log")
        println("Generate Data870")
        return Data870(id = 1) 
    }

}
