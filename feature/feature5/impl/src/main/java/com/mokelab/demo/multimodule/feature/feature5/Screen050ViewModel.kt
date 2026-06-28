package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data491Repository 
import com.mokelab.demo.multimodule.core.data.Data492Repository 
import com.mokelab.demo.multimodule.core.data.Data493Repository 
import com.mokelab.demo.multimodule.core.data.Data494Repository 
import com.mokelab.demo.multimodule.core.data.Data495Repository 
import com.mokelab.demo.multimodule.core.data.Data496Repository 
import com.mokelab.demo.multimodule.core.data.Data497Repository 
import com.mokelab.demo.multimodule.core.data.Data498Repository 
import com.mokelab.demo.multimodule.core.data.Data499Repository 
import com.mokelab.demo.multimodule.core.data.Data500Repository 

import javax.inject.Inject

@HiltViewModel
class Screen050ViewModel @Inject constructor(
    private val repo1: Data491Repository,
    private val repo2: Data492Repository,
    private val repo3: Data493Repository,
    private val repo4: Data494Repository,
    private val repo5: Data495Repository,
    private val repo6: Data496Repository,
    private val repo7: Data497Repository,
    private val repo8: Data498Repository,
    private val repo9: Data499Repository,
    private val repo10: Data500Repository,

): ViewModel() {
}
