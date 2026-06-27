package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.core.model.Data541
import com.mokelab.demo.multimodule.core.model.Data542
import com.mokelab.demo.multimodule.core.model.Data543
import com.mokelab.demo.multimodule.core.model.Data544
import com.mokelab.demo.multimodule.core.model.Data545
import com.mokelab.demo.multimodule.core.model.Data546
import com.mokelab.demo.multimodule.core.model.Data547
import com.mokelab.demo.multimodule.core.model.Data548
import com.mokelab.demo.multimodule.core.model.Data549
import com.mokelab.demo.multimodule.core.model.Data550

import javax.inject.Inject

class Data555RepositoryImpl @Inject constructor(): Data555Repository {

    override fun get1(): Data541 {
        println("Debug log")
        println("Generate Data541")
        return Data541(id = 1) 
    }

    override fun get2(): Data542 {
        println("Debug log")
        println("Generate Data542")
        return Data542(id = 1) 
    }

    override fun get3(): Data543 {
        println("Debug log")
        println("Generate Data543")
        return Data543(id = 1) 
    }

    override fun get4(): Data544 {
        println("Debug log")
        println("Generate Data544")
        return Data544(id = 1) 
    }

    override fun get5(): Data545 {
        println("Debug log")
        println("Generate Data545")
        return Data545(id = 1) 
    }

    override fun get6(): Data546 {
        println("Debug log")
        println("Generate Data546")
        return Data546(id = 1) 
    }

    override fun get7(): Data547 {
        println("Debug log")
        println("Generate Data547")
        return Data547(id = 1) 
    }

    override fun get8(): Data548 {
        println("Debug log")
        println("Generate Data548")
        return Data548(id = 1) 
    }

    override fun get9(): Data549 {
        println("Debug log")
        println("Generate Data549")
        return Data549(id = 1) 
    }

    override fun get10(): Data550 {
        println("Debug log")
        println("Generate Data550")
        return Data550(id = 1) 
    }

}
