package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data661
import com.mokelab.demo.multimodule.core.model.Data662
import com.mokelab.demo.multimodule.core.model.Data663
import com.mokelab.demo.multimodule.core.model.Data664
import com.mokelab.demo.multimodule.core.model.Data665
import com.mokelab.demo.multimodule.core.model.Data666
import com.mokelab.demo.multimodule.core.model.Data667
import com.mokelab.demo.multimodule.core.model.Data668
import com.mokelab.demo.multimodule.core.model.Data669
import com.mokelab.demo.multimodule.core.model.Data670

import javax.inject.Inject

class Data667RepositoryImpl @Inject constructor(): Data667Repository {

    override fun get1(): Data661 {
        println("Debug log")
        println("Generate Data661")
        return Data661(id = 1) 
    }

    override fun get2(): Data662 {
        println("Debug log")
        println("Generate Data662")
        return Data662(id = 1) 
    }

    override fun get3(): Data663 {
        println("Debug log")
        println("Generate Data663")
        return Data663(id = 1) 
    }

    override fun get4(): Data664 {
        println("Debug log")
        println("Generate Data664")
        return Data664(id = 1) 
    }

    override fun get5(): Data665 {
        println("Debug log")
        println("Generate Data665")
        return Data665(id = 1) 
    }

    override fun get6(): Data666 {
        println("Debug log")
        println("Generate Data666")
        return Data666(id = 1) 
    }

    override fun get7(): Data667 {
        println("Debug log")
        println("Generate Data667")
        return Data667(id = 1) 
    }

    override fun get8(): Data668 {
        println("Debug log")
        println("Generate Data668")
        return Data668(id = 1) 
    }

    override fun get9(): Data669 {
        println("Debug log")
        println("Generate Data669")
        return Data669(id = 1) 
    }

    override fun get10(): Data670 {
        println("Debug log")
        println("Generate Data670")
        return Data670(id = 1) 
    }

}
