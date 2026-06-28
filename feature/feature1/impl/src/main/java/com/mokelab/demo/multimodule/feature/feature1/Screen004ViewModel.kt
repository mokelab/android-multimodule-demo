package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data031Repository 
import com.mokelab.demo.multimodule.core.data.Data032Repository 
import com.mokelab.demo.multimodule.core.data.Data033Repository 
import com.mokelab.demo.multimodule.core.data.Data034Repository 
import com.mokelab.demo.multimodule.core.data.Data035Repository 
import com.mokelab.demo.multimodule.core.data.Data036Repository 
import com.mokelab.demo.multimodule.core.data.Data037Repository 
import com.mokelab.demo.multimodule.core.data.Data038Repository 
import com.mokelab.demo.multimodule.core.data.Data039Repository 
import com.mokelab.demo.multimodule.core.data.Data040Repository 

import javax.inject.Inject

@HiltViewModel
class Screen004ViewModel @Inject constructor(
    private val repo1: Data031Repository,
    private val repo2: Data032Repository,
    private val repo3: Data033Repository,
    private val repo4: Data034Repository,
    private val repo5: Data035Repository,
    private val repo6: Data036Repository,
    private val repo7: Data037Repository,
    private val repo8: Data038Repository,
    private val repo9: Data039Repository,
    private val repo10: Data040Repository,

): ViewModel() {
}
