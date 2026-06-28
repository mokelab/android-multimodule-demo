package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data131Repository 
import com.mokelab.demo.multimodule.core.data.Data132Repository 
import com.mokelab.demo.multimodule.core.data.Data133Repository 
import com.mokelab.demo.multimodule.core.data.Data134Repository 
import com.mokelab.demo.multimodule.core.data.Data135Repository 
import com.mokelab.demo.multimodule.core.data.Data136Repository 
import com.mokelab.demo.multimodule.core.data.Data137Repository 
import com.mokelab.demo.multimodule.core.data.Data138Repository 
import com.mokelab.demo.multimodule.core.data.Data139Repository 
import com.mokelab.demo.multimodule.core.data.Data140Repository 

import javax.inject.Inject

@HiltViewModel
class Screen014ViewModel @Inject constructor(
    private val repo1: Data131Repository,
    private val repo2: Data132Repository,
    private val repo3: Data133Repository,
    private val repo4: Data134Repository,
    private val repo5: Data135Repository,
    private val repo6: Data136Repository,
    private val repo7: Data137Repository,
    private val repo8: Data138Repository,
    private val repo9: Data139Repository,
    private val repo10: Data140Repository,

): ViewModel() {
}
