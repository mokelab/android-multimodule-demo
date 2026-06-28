package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data161Repository 
import com.mokelab.demo.multimodule.core.data.Data162Repository 
import com.mokelab.demo.multimodule.core.data.Data163Repository 
import com.mokelab.demo.multimodule.core.data.Data164Repository 
import com.mokelab.demo.multimodule.core.data.Data165Repository 
import com.mokelab.demo.multimodule.core.data.Data166Repository 
import com.mokelab.demo.multimodule.core.data.Data167Repository 
import com.mokelab.demo.multimodule.core.data.Data168Repository 
import com.mokelab.demo.multimodule.core.data.Data169Repository 
import com.mokelab.demo.multimodule.core.data.Data170Repository 

import javax.inject.Inject

@HiltViewModel
class Screen017ViewModel @Inject constructor(
    private val repo1: Data161Repository,
    private val repo2: Data162Repository,
    private val repo3: Data163Repository,
    private val repo4: Data164Repository,
    private val repo5: Data165Repository,
    private val repo6: Data166Repository,
    private val repo7: Data167Repository,
    private val repo8: Data168Repository,
    private val repo9: Data169Repository,
    private val repo10: Data170Repository,

): ViewModel() {
}
