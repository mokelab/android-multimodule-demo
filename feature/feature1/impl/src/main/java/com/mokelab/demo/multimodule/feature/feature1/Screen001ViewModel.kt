package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data001Repository 
import com.mokelab.demo.multimodule.core.data.Data002Repository 
import com.mokelab.demo.multimodule.core.data.Data003Repository 
import com.mokelab.demo.multimodule.core.data.Data004Repository 
import com.mokelab.demo.multimodule.core.data.Data005Repository 
import com.mokelab.demo.multimodule.core.data.Data006Repository 
import com.mokelab.demo.multimodule.core.data.Data007Repository 
import com.mokelab.demo.multimodule.core.data.Data008Repository 
import com.mokelab.demo.multimodule.core.data.Data009Repository 
import com.mokelab.demo.multimodule.core.data.Data010Repository 

import javax.inject.Inject

@HiltViewModel
class Screen001ViewModel @Inject constructor(
    private val repo1: Data001Repository,
    private val repo2: Data002Repository,
    private val repo3: Data003Repository,
    private val repo4: Data004Repository,
    private val repo5: Data005Repository,
    private val repo6: Data006Repository,
    private val repo7: Data007Repository,
    private val repo8: Data008Repository,
    private val repo9: Data009Repository,
    private val repo10: Data010Repository,

): ViewModel() {
}
