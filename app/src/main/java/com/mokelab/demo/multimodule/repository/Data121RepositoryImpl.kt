package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data201
import com.mokelab.demo.multimodule.model.Data202
import com.mokelab.demo.multimodule.model.Data203
import com.mokelab.demo.multimodule.model.Data204
import com.mokelab.demo.multimodule.model.Data205
import com.mokelab.demo.multimodule.model.Data206
import com.mokelab.demo.multimodule.model.Data207
import com.mokelab.demo.multimodule.model.Data208
import com.mokelab.demo.multimodule.model.Data209
import com.mokelab.demo.multimodule.model.Data210

import javax.inject.Inject

class Data121RepositoryImpl @Inject constructor(): Data121Repository {

    override fun get1(): Data201 {
        println("Debug log")
        println("Generate Data201")
        return Data201(id = 1) 
    }

    override fun get2(): Data202 {
        println("Debug log")
        println("Generate Data202")
        return Data202(id = 1) 
    }

    override fun get3(): Data203 {
        println("Debug log")
        println("Generate Data203")
        return Data203(id = 1) 
    }

    override fun get4(): Data204 {
        println("Debug log")
        println("Generate Data204")
        return Data204(id = 1) 
    }

    override fun get5(): Data205 {
        println("Debug log")
        println("Generate Data205")
        return Data205(id = 1) 
    }

    override fun get6(): Data206 {
        println("Debug log")
        println("Generate Data206")
        return Data206(id = 1) 
    }

    override fun get7(): Data207 {
        println("Debug log")
        println("Generate Data207")
        return Data207(id = 1) 
    }

    override fun get8(): Data208 {
        println("Debug log")
        println("Generate Data208")
        return Data208(id = 1) 
    }

    override fun get9(): Data209 {
        println("Debug log")
        println("Generate Data209")
        return Data209(id = 1) 
    }

    override fun get10(): Data210 {
        println("Debug log")
        println("Generate Data210")
        return Data210(id = 1) 
    }

}
