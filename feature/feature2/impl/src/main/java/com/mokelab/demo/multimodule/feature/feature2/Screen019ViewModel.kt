package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data181Repository 
import com.mokelab.demo.multimodule.core.data.Data182Repository 
import com.mokelab.demo.multimodule.core.data.Data183Repository 
import com.mokelab.demo.multimodule.core.data.Data184Repository 
import com.mokelab.demo.multimodule.core.data.Data185Repository 
import com.mokelab.demo.multimodule.core.data.Data186Repository 
import com.mokelab.demo.multimodule.core.data.Data187Repository 
import com.mokelab.demo.multimodule.core.data.Data188Repository 
import com.mokelab.demo.multimodule.core.data.Data189Repository 
import com.mokelab.demo.multimodule.core.data.Data190Repository 

import javax.inject.Inject

@HiltViewModel
class Screen019ViewModel @Inject constructor(
    private val repo1: Data181Repository,
    private val repo2: Data182Repository,
    private val repo3: Data183Repository,
    private val repo4: Data184Repository,
    private val repo5: Data185Repository,
    private val repo6: Data186Repository,
    private val repo7: Data187Repository,
    private val repo8: Data188Repository,
    private val repo9: Data189Repository,
    private val repo10: Data190Repository,

): ViewModel() {
}
