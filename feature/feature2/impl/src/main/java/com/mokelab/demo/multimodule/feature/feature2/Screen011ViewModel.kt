package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data101Repository 
import com.mokelab.demo.multimodule.core.data.Data102Repository 
import com.mokelab.demo.multimodule.core.data.Data103Repository 
import com.mokelab.demo.multimodule.core.data.Data104Repository 
import com.mokelab.demo.multimodule.core.data.Data105Repository 
import com.mokelab.demo.multimodule.core.data.Data106Repository 
import com.mokelab.demo.multimodule.core.data.Data107Repository 
import com.mokelab.demo.multimodule.core.data.Data108Repository 
import com.mokelab.demo.multimodule.core.data.Data109Repository 
import com.mokelab.demo.multimodule.core.data.Data110Repository 

import javax.inject.Inject

@HiltViewModel
class Screen011ViewModel @Inject constructor(
    private val repo1: Data101Repository,
    private val repo2: Data102Repository,
    private val repo3: Data103Repository,
    private val repo4: Data104Repository,
    private val repo5: Data105Repository,
    private val repo6: Data106Repository,
    private val repo7: Data107Repository,
    private val repo8: Data108Repository,
    private val repo9: Data109Repository,
    private val repo10: Data110Repository,

): ViewModel() {
}
