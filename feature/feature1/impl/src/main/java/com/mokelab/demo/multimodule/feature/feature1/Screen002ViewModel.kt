package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data011Repository 
import com.mokelab.demo.multimodule.core.data.Data012Repository 
import com.mokelab.demo.multimodule.core.data.Data013Repository 
import com.mokelab.demo.multimodule.core.data.Data014Repository 
import com.mokelab.demo.multimodule.core.data.Data015Repository 
import com.mokelab.demo.multimodule.core.data.Data016Repository 
import com.mokelab.demo.multimodule.core.data.Data017Repository 
import com.mokelab.demo.multimodule.core.data.Data018Repository 
import com.mokelab.demo.multimodule.core.data.Data019Repository 
import com.mokelab.demo.multimodule.core.data.Data020Repository 

import javax.inject.Inject

@HiltViewModel
class Screen002ViewModel @Inject constructor(
    private val repo1: Data011Repository,
    private val repo2: Data012Repository,
    private val repo3: Data013Repository,
    private val repo4: Data014Repository,
    private val repo5: Data015Repository,
    private val repo6: Data016Repository,
    private val repo7: Data017Repository,
    private val repo8: Data018Repository,
    private val repo9: Data019Repository,
    private val repo10: Data020Repository,

): ViewModel() {
}
