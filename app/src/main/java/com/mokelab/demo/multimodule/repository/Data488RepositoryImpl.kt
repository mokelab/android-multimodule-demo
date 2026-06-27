package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data871
import com.mokelab.demo.multimodule.model.Data872
import com.mokelab.demo.multimodule.model.Data873
import com.mokelab.demo.multimodule.model.Data874
import com.mokelab.demo.multimodule.model.Data875
import com.mokelab.demo.multimodule.model.Data876
import com.mokelab.demo.multimodule.model.Data877
import com.mokelab.demo.multimodule.model.Data878
import com.mokelab.demo.multimodule.model.Data879
import com.mokelab.demo.multimodule.model.Data880

import javax.inject.Inject

class Data488RepositoryImpl @Inject constructor(): Data488Repository {

    override fun get1(): Data871 {
        println("Debug log")
        println("Generate Data871")
        return Data871(id = 1) 
    }

    override fun get2(): Data872 {
        println("Debug log")
        println("Generate Data872")
        return Data872(id = 1) 
    }

    override fun get3(): Data873 {
        println("Debug log")
        println("Generate Data873")
        return Data873(id = 1) 
    }

    override fun get4(): Data874 {
        println("Debug log")
        println("Generate Data874")
        return Data874(id = 1) 
    }

    override fun get5(): Data875 {
        println("Debug log")
        println("Generate Data875")
        return Data875(id = 1) 
    }

    override fun get6(): Data876 {
        println("Debug log")
        println("Generate Data876")
        return Data876(id = 1) 
    }

    override fun get7(): Data877 {
        println("Debug log")
        println("Generate Data877")
        return Data877(id = 1) 
    }

    override fun get8(): Data878 {
        println("Debug log")
        println("Generate Data878")
        return Data878(id = 1) 
    }

    override fun get9(): Data879 {
        println("Debug log")
        println("Generate Data879")
        return Data879(id = 1) 
    }

    override fun get10(): Data880 {
        println("Debug log")
        println("Generate Data880")
        return Data880(id = 1) 
    }

}
