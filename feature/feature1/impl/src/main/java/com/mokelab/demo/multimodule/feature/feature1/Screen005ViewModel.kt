package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data041Repository 
import com.mokelab.demo.multimodule.core.data.Data042Repository 
import com.mokelab.demo.multimodule.core.data.Data043Repository 
import com.mokelab.demo.multimodule.core.data.Data044Repository 
import com.mokelab.demo.multimodule.core.data.Data045Repository 
import com.mokelab.demo.multimodule.core.data.Data046Repository 
import com.mokelab.demo.multimodule.core.data.Data047Repository 
import com.mokelab.demo.multimodule.core.data.Data048Repository 
import com.mokelab.demo.multimodule.core.data.Data049Repository 
import com.mokelab.demo.multimodule.core.data.Data050Repository 

import javax.inject.Inject

@HiltViewModel
class Screen005ViewModel @Inject constructor(
    private val repo1: Data041Repository,
    private val repo2: Data042Repository,
    private val repo3: Data043Repository,
    private val repo4: Data044Repository,
    private val repo5: Data045Repository,
    private val repo6: Data046Repository,
    private val repo7: Data047Repository,
    private val repo8: Data048Repository,
    private val repo9: Data049Repository,
    private val repo10: Data050Repository,

): ViewModel() {
}
