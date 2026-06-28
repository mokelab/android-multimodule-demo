package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data281Repository 
import com.mokelab.demo.multimodule.core.data.Data282Repository 
import com.mokelab.demo.multimodule.core.data.Data283Repository 
import com.mokelab.demo.multimodule.core.data.Data284Repository 
import com.mokelab.demo.multimodule.core.data.Data285Repository 
import com.mokelab.demo.multimodule.core.data.Data286Repository 
import com.mokelab.demo.multimodule.core.data.Data287Repository 
import com.mokelab.demo.multimodule.core.data.Data288Repository 
import com.mokelab.demo.multimodule.core.data.Data289Repository 
import com.mokelab.demo.multimodule.core.data.Data290Repository 

import javax.inject.Inject

@HiltViewModel
class Screen029ViewModel @Inject constructor(
    private val repo1: Data281Repository,
    private val repo2: Data282Repository,
    private val repo3: Data283Repository,
    private val repo4: Data284Repository,
    private val repo5: Data285Repository,
    private val repo6: Data286Repository,
    private val repo7: Data287Repository,
    private val repo8: Data288Repository,
    private val repo9: Data289Repository,
    private val repo10: Data290Repository,

): ViewModel() {
}
