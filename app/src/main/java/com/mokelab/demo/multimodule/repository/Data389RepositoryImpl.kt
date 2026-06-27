package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data881
import com.mokelab.demo.multimodule.model.Data882
import com.mokelab.demo.multimodule.model.Data883
import com.mokelab.demo.multimodule.model.Data884
import com.mokelab.demo.multimodule.model.Data885
import com.mokelab.demo.multimodule.model.Data886
import com.mokelab.demo.multimodule.model.Data887
import com.mokelab.demo.multimodule.model.Data888
import com.mokelab.demo.multimodule.model.Data889
import com.mokelab.demo.multimodule.model.Data890

import javax.inject.Inject

class Data389RepositoryImpl @Inject constructor(): Data389Repository {

    override fun get1(): Data881 {
        println("Debug log")
        println("Generate Data881")
        return Data881(id = 1) 
    }

    override fun get2(): Data882 {
        println("Debug log")
        println("Generate Data882")
        return Data882(id = 1) 
    }

    override fun get3(): Data883 {
        println("Debug log")
        println("Generate Data883")
        return Data883(id = 1) 
    }

    override fun get4(): Data884 {
        println("Debug log")
        println("Generate Data884")
        return Data884(id = 1) 
    }

    override fun get5(): Data885 {
        println("Debug log")
        println("Generate Data885")
        return Data885(id = 1) 
    }

    override fun get6(): Data886 {
        println("Debug log")
        println("Generate Data886")
        return Data886(id = 1) 
    }

    override fun get7(): Data887 {
        println("Debug log")
        println("Generate Data887")
        return Data887(id = 1) 
    }

    override fun get8(): Data888 {
        println("Debug log")
        println("Generate Data888")
        return Data888(id = 1) 
    }

    override fun get9(): Data889 {
        println("Debug log")
        println("Generate Data889")
        return Data889(id = 1) 
    }

    override fun get10(): Data890 {
        println("Debug log")
        println("Generate Data890")
        return Data890(id = 1) 
    }

}
