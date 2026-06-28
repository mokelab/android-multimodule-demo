package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data261Repository 
import com.mokelab.demo.multimodule.core.data.Data262Repository 
import com.mokelab.demo.multimodule.core.data.Data263Repository 
import com.mokelab.demo.multimodule.core.data.Data264Repository 
import com.mokelab.demo.multimodule.core.data.Data265Repository 
import com.mokelab.demo.multimodule.core.data.Data266Repository 
import com.mokelab.demo.multimodule.core.data.Data267Repository 
import com.mokelab.demo.multimodule.core.data.Data268Repository 
import com.mokelab.demo.multimodule.core.data.Data269Repository 
import com.mokelab.demo.multimodule.core.data.Data270Repository 

import javax.inject.Inject

@HiltViewModel
class Screen027ViewModel @Inject constructor(
    private val repo1: Data261Repository,
    private val repo2: Data262Repository,
    private val repo3: Data263Repository,
    private val repo4: Data264Repository,
    private val repo5: Data265Repository,
    private val repo6: Data266Repository,
    private val repo7: Data267Repository,
    private val repo8: Data268Repository,
    private val repo9: Data269Repository,
    private val repo10: Data270Repository,

): ViewModel() {
}
