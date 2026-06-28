package com.mokelab.demo.multimodule.core.data

import com.mokelab.demo.multimodule.core.model.Data001
import com.mokelab.demo.multimodule.core.model.Data002
import com.mokelab.demo.multimodule.core.model.Data003
import com.mokelab.demo.multimodule.core.model.Data004
import com.mokelab.demo.multimodule.core.model.Data005
import com.mokelab.demo.multimodule.core.model.Data006
import com.mokelab.demo.multimodule.core.model.Data007
import com.mokelab.demo.multimodule.core.model.Data008
import com.mokelab.demo.multimodule.core.model.Data009
import com.mokelab.demo.multimodule.core.model.Data010


interface Data101Repository {
    fun get1(): Data001
    fun get2(): Data002
    fun get3(): Data003
    fun get4(): Data004
    fun get5(): Data005
    fun get6(): Data006
    fun get7(): Data007
    fun get8(): Data008
    fun get9(): Data009
    fun get10(): Data010

}
