package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data081Repository 
import com.mokelab.demo.multimodule.core.data.Data082Repository 
import com.mokelab.demo.multimodule.core.data.Data083Repository 
import com.mokelab.demo.multimodule.core.data.Data084Repository 
import com.mokelab.demo.multimodule.core.data.Data085Repository 
import com.mokelab.demo.multimodule.core.data.Data086Repository 
import com.mokelab.demo.multimodule.core.data.Data087Repository 
import com.mokelab.demo.multimodule.core.data.Data088Repository 
import com.mokelab.demo.multimodule.core.data.Data089Repository 
import com.mokelab.demo.multimodule.core.data.Data090Repository 

import javax.inject.Inject

@HiltViewModel
class Screen009ViewModel @Inject constructor(
    private val repo1: Data081Repository,
    private val repo2: Data082Repository,
    private val repo3: Data083Repository,
    private val repo4: Data084Repository,
    private val repo5: Data085Repository,
    private val repo6: Data086Repository,
    private val repo7: Data087Repository,
    private val repo8: Data088Repository,
    private val repo9: Data089Repository,
    private val repo10: Data090Repository,

): ViewModel() {
}
