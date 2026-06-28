package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data251Repository 
import com.mokelab.demo.multimodule.core.data.Data252Repository 
import com.mokelab.demo.multimodule.core.data.Data253Repository 
import com.mokelab.demo.multimodule.core.data.Data254Repository 
import com.mokelab.demo.multimodule.core.data.Data255Repository 
import com.mokelab.demo.multimodule.core.data.Data256Repository 
import com.mokelab.demo.multimodule.core.data.Data257Repository 
import com.mokelab.demo.multimodule.core.data.Data258Repository 
import com.mokelab.demo.multimodule.core.data.Data259Repository 
import com.mokelab.demo.multimodule.core.data.Data260Repository 

import javax.inject.Inject

@HiltViewModel
class Screen026ViewModel @Inject constructor(
    private val repo1: Data251Repository,
    private val repo2: Data252Repository,
    private val repo3: Data253Repository,
    private val repo4: Data254Repository,
    private val repo5: Data255Repository,
    private val repo6: Data256Repository,
    private val repo7: Data257Repository,
    private val repo8: Data258Repository,
    private val repo9: Data259Repository,
    private val repo10: Data260Repository,

): ViewModel() {
}
