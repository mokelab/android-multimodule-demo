package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data391Repository 
import com.mokelab.demo.multimodule.core.data.Data392Repository 
import com.mokelab.demo.multimodule.core.data.Data393Repository 
import com.mokelab.demo.multimodule.core.data.Data394Repository 
import com.mokelab.demo.multimodule.core.data.Data395Repository 
import com.mokelab.demo.multimodule.core.data.Data396Repository 
import com.mokelab.demo.multimodule.core.data.Data397Repository 
import com.mokelab.demo.multimodule.core.data.Data398Repository 
import com.mokelab.demo.multimodule.core.data.Data399Repository 
import com.mokelab.demo.multimodule.core.data.Data400Repository 

import javax.inject.Inject

@HiltViewModel
class Screen040ViewModel @Inject constructor(
    private val repo1: Data391Repository,
    private val repo2: Data392Repository,
    private val repo3: Data393Repository,
    private val repo4: Data394Repository,
    private val repo5: Data395Repository,
    private val repo6: Data396Repository,
    private val repo7: Data397Repository,
    private val repo8: Data398Repository,
    private val repo9: Data399Repository,
    private val repo10: Data400Repository,

): ViewModel() {
}
