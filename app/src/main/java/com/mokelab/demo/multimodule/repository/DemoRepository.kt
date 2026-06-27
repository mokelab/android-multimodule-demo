package com.mokelab.demo.multimodule.repository

import com.mokelab.demo.multimodule.model.Data001
import com.mokelab.demo.multimodule.model.Data002

interface DemoRepository {
    fun get1(): Data001
    fun get2(): Data002
}