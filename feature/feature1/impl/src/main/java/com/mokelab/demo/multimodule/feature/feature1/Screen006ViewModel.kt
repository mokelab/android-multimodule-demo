package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data051Repository 
import com.mokelab.demo.multimodule.core.data.Data052Repository 
import com.mokelab.demo.multimodule.core.data.Data053Repository 
import com.mokelab.demo.multimodule.core.data.Data054Repository 
import com.mokelab.demo.multimodule.core.data.Data055Repository 
import com.mokelab.demo.multimodule.core.data.Data056Repository 
import com.mokelab.demo.multimodule.core.data.Data057Repository 
import com.mokelab.demo.multimodule.core.data.Data058Repository 
import com.mokelab.demo.multimodule.core.data.Data059Repository 
import com.mokelab.demo.multimodule.core.data.Data060Repository 

import javax.inject.Inject

@HiltViewModel
class Screen006ViewModel @Inject constructor(
    private val repo1: Data051Repository,
    private val repo2: Data052Repository,
    private val repo3: Data053Repository,
    private val repo4: Data054Repository,
    private val repo5: Data055Repository,
    private val repo6: Data056Repository,
    private val repo7: Data057Repository,
    private val repo8: Data058Repository,
    private val repo9: Data059Repository,
    private val repo10: Data060Repository,

): ViewModel() {
}
