package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data071Repository 
import com.mokelab.demo.multimodule.core.data.Data072Repository 
import com.mokelab.demo.multimodule.core.data.Data073Repository 
import com.mokelab.demo.multimodule.core.data.Data074Repository 
import com.mokelab.demo.multimodule.core.data.Data075Repository 
import com.mokelab.demo.multimodule.core.data.Data076Repository 
import com.mokelab.demo.multimodule.core.data.Data077Repository 
import com.mokelab.demo.multimodule.core.data.Data078Repository 
import com.mokelab.demo.multimodule.core.data.Data079Repository 
import com.mokelab.demo.multimodule.core.data.Data080Repository 

import javax.inject.Inject

@HiltViewModel
class Screen008ViewModel @Inject constructor(
    private val repo1: Data071Repository,
    private val repo2: Data072Repository,
    private val repo3: Data073Repository,
    private val repo4: Data074Repository,
    private val repo5: Data075Repository,
    private val repo6: Data076Repository,
    private val repo7: Data077Repository,
    private val repo8: Data078Repository,
    private val repo9: Data079Repository,
    private val repo10: Data080Repository,

): ViewModel() {
}
