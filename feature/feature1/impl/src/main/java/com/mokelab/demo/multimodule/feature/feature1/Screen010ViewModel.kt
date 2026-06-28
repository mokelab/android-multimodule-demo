package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data091Repository 
import com.mokelab.demo.multimodule.core.data.Data092Repository 
import com.mokelab.demo.multimodule.core.data.Data093Repository 
import com.mokelab.demo.multimodule.core.data.Data094Repository 
import com.mokelab.demo.multimodule.core.data.Data095Repository 
import com.mokelab.demo.multimodule.core.data.Data096Repository 
import com.mokelab.demo.multimodule.core.data.Data097Repository 
import com.mokelab.demo.multimodule.core.data.Data098Repository 
import com.mokelab.demo.multimodule.core.data.Data099Repository 
import com.mokelab.demo.multimodule.core.data.Data100Repository 

import javax.inject.Inject

@HiltViewModel
class Screen010ViewModel @Inject constructor(
    private val repo1: Data091Repository,
    private val repo2: Data092Repository,
    private val repo3: Data093Repository,
    private val repo4: Data094Repository,
    private val repo5: Data095Repository,
    private val repo6: Data096Repository,
    private val repo7: Data097Repository,
    private val repo8: Data098Repository,
    private val repo9: Data099Repository,
    private val repo10: Data100Repository,

): ViewModel() {
}
