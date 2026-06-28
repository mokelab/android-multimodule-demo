package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data151Repository 
import com.mokelab.demo.multimodule.core.data.Data152Repository 
import com.mokelab.demo.multimodule.core.data.Data153Repository 
import com.mokelab.demo.multimodule.core.data.Data154Repository 
import com.mokelab.demo.multimodule.core.data.Data155Repository 
import com.mokelab.demo.multimodule.core.data.Data156Repository 
import com.mokelab.demo.multimodule.core.data.Data157Repository 
import com.mokelab.demo.multimodule.core.data.Data158Repository 
import com.mokelab.demo.multimodule.core.data.Data159Repository 
import com.mokelab.demo.multimodule.core.data.Data160Repository 

import javax.inject.Inject

@HiltViewModel
class Screen016ViewModel @Inject constructor(
    private val repo1: Data151Repository,
    private val repo2: Data152Repository,
    private val repo3: Data153Repository,
    private val repo4: Data154Repository,
    private val repo5: Data155Repository,
    private val repo6: Data156Repository,
    private val repo7: Data157Repository,
    private val repo8: Data158Repository,
    private val repo9: Data159Repository,
    private val repo10: Data160Repository,

): ViewModel() {
}
