package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data121Repository 
import com.mokelab.demo.multimodule.core.data.Data122Repository 
import com.mokelab.demo.multimodule.core.data.Data123Repository 
import com.mokelab.demo.multimodule.core.data.Data124Repository 
import com.mokelab.demo.multimodule.core.data.Data125Repository 
import com.mokelab.demo.multimodule.core.data.Data126Repository 
import com.mokelab.demo.multimodule.core.data.Data127Repository 
import com.mokelab.demo.multimodule.core.data.Data128Repository 
import com.mokelab.demo.multimodule.core.data.Data129Repository 
import com.mokelab.demo.multimodule.core.data.Data130Repository 

import javax.inject.Inject

@HiltViewModel
class Screen013ViewModel @Inject constructor(
    private val repo1: Data121Repository,
    private val repo2: Data122Repository,
    private val repo3: Data123Repository,
    private val repo4: Data124Repository,
    private val repo5: Data125Repository,
    private val repo6: Data126Repository,
    private val repo7: Data127Repository,
    private val repo8: Data128Repository,
    private val repo9: Data129Repository,
    private val repo10: Data130Repository,

): ViewModel() {
}
