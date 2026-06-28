package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data111Repository 
import com.mokelab.demo.multimodule.core.data.Data112Repository 
import com.mokelab.demo.multimodule.core.data.Data113Repository 
import com.mokelab.demo.multimodule.core.data.Data114Repository 
import com.mokelab.demo.multimodule.core.data.Data115Repository 
import com.mokelab.demo.multimodule.core.data.Data116Repository 
import com.mokelab.demo.multimodule.core.data.Data117Repository 
import com.mokelab.demo.multimodule.core.data.Data118Repository 
import com.mokelab.demo.multimodule.core.data.Data119Repository 
import com.mokelab.demo.multimodule.core.data.Data120Repository 

import javax.inject.Inject

@HiltViewModel
class Screen012ViewModel @Inject constructor(
    private val repo1: Data111Repository,
    private val repo2: Data112Repository,
    private val repo3: Data113Repository,
    private val repo4: Data114Repository,
    private val repo5: Data115Repository,
    private val repo6: Data116Repository,
    private val repo7: Data117Repository,
    private val repo8: Data118Repository,
    private val repo9: Data119Repository,
    private val repo10: Data120Repository,

): ViewModel() {
}
