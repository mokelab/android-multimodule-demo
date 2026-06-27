package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data031
import com.mokelab.demo.multimodule.model.Data032
import com.mokelab.demo.multimodule.model.Data033
import com.mokelab.demo.multimodule.model.Data034
import com.mokelab.demo.multimodule.model.Data035
import com.mokelab.demo.multimodule.model.Data036
import com.mokelab.demo.multimodule.model.Data037
import com.mokelab.demo.multimodule.model.Data038
import com.mokelab.demo.multimodule.model.Data039
import com.mokelab.demo.multimodule.model.Data040

import javax.inject.Inject

class Data104RepositoryImpl @Inject constructor(): Data104Repository {

    override fun get1(): Data031 {
        println("Debug log")
        println("Generate Data031")
        return Data031(id = 1) 
    }

    override fun get2(): Data032 {
        println("Debug log")
        println("Generate Data032")
        return Data032(id = 1) 
    }

    override fun get3(): Data033 {
        println("Debug log")
        println("Generate Data033")
        return Data033(id = 1) 
    }

    override fun get4(): Data034 {
        println("Debug log")
        println("Generate Data034")
        return Data034(id = 1) 
    }

    override fun get5(): Data035 {
        println("Debug log")
        println("Generate Data035")
        return Data035(id = 1) 
    }

    override fun get6(): Data036 {
        println("Debug log")
        println("Generate Data036")
        return Data036(id = 1) 
    }

    override fun get7(): Data037 {
        println("Debug log")
        println("Generate Data037")
        return Data037(id = 1) 
    }

    override fun get8(): Data038 {
        println("Debug log")
        println("Generate Data038")
        return Data038(id = 1) 
    }

    override fun get9(): Data039 {
        println("Debug log")
        println("Generate Data039")
        return Data039(id = 1) 
    }

    override fun get10(): Data040 {
        println("Debug log")
        println("Generate Data040")
        return Data040(id = 1) 
    }

}
