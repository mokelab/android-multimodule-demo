package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data191Repository 
import com.mokelab.demo.multimodule.core.data.Data192Repository 
import com.mokelab.demo.multimodule.core.data.Data193Repository 
import com.mokelab.demo.multimodule.core.data.Data194Repository 
import com.mokelab.demo.multimodule.core.data.Data195Repository 
import com.mokelab.demo.multimodule.core.data.Data196Repository 
import com.mokelab.demo.multimodule.core.data.Data197Repository 
import com.mokelab.demo.multimodule.core.data.Data198Repository 
import com.mokelab.demo.multimodule.core.data.Data199Repository 
import com.mokelab.demo.multimodule.core.data.Data200Repository 

import javax.inject.Inject

@HiltViewModel
class Screen020ViewModel @Inject constructor(
    private val repo1: Data191Repository,
    private val repo2: Data192Repository,
    private val repo3: Data193Repository,
    private val repo4: Data194Repository,
    private val repo5: Data195Repository,
    private val repo6: Data196Repository,
    private val repo7: Data197Repository,
    private val repo8: Data198Repository,
    private val repo9: Data199Repository,
    private val repo10: Data200Repository,

): ViewModel() {
}
