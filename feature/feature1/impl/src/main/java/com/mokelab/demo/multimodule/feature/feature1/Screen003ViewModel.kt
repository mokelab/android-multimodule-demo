package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data021Repository 
import com.mokelab.demo.multimodule.core.data.Data022Repository 
import com.mokelab.demo.multimodule.core.data.Data023Repository 
import com.mokelab.demo.multimodule.core.data.Data024Repository 
import com.mokelab.demo.multimodule.core.data.Data025Repository 
import com.mokelab.demo.multimodule.core.data.Data026Repository 
import com.mokelab.demo.multimodule.core.data.Data027Repository 
import com.mokelab.demo.multimodule.core.data.Data028Repository 
import com.mokelab.demo.multimodule.core.data.Data029Repository 
import com.mokelab.demo.multimodule.core.data.Data030Repository 

import javax.inject.Inject

@HiltViewModel
class Screen003ViewModel @Inject constructor(
    private val repo1: Data021Repository,
    private val repo2: Data022Repository,
    private val repo3: Data023Repository,
    private val repo4: Data024Repository,
    private val repo5: Data025Repository,
    private val repo6: Data026Repository,
    private val repo7: Data027Repository,
    private val repo8: Data028Repository,
    private val repo9: Data029Repository,
    private val repo10: Data030Repository,

): ViewModel() {
}
