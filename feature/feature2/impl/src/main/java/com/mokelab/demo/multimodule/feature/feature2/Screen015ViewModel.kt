package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data141Repository 
import com.mokelab.demo.multimodule.core.data.Data142Repository 
import com.mokelab.demo.multimodule.core.data.Data143Repository 
import com.mokelab.demo.multimodule.core.data.Data144Repository 
import com.mokelab.demo.multimodule.core.data.Data145Repository 
import com.mokelab.demo.multimodule.core.data.Data146Repository 
import com.mokelab.demo.multimodule.core.data.Data147Repository 
import com.mokelab.demo.multimodule.core.data.Data148Repository 
import com.mokelab.demo.multimodule.core.data.Data149Repository 
import com.mokelab.demo.multimodule.core.data.Data150Repository 

import javax.inject.Inject

@HiltViewModel
class Screen015ViewModel @Inject constructor(
    private val repo1: Data141Repository,
    private val repo2: Data142Repository,
    private val repo3: Data143Repository,
    private val repo4: Data144Repository,
    private val repo5: Data145Repository,
    private val repo6: Data146Repository,
    private val repo7: Data147Repository,
    private val repo8: Data148Repository,
    private val repo9: Data149Repository,
    private val repo10: Data150Repository,

): ViewModel() {
}
