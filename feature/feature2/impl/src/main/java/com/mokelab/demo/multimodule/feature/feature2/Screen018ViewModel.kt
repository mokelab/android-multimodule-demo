package com.mokelab.demo.multimodule.feature.feature2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data171Repository 
import com.mokelab.demo.multimodule.core.data.Data172Repository 
import com.mokelab.demo.multimodule.core.data.Data173Repository 
import com.mokelab.demo.multimodule.core.data.Data174Repository 
import com.mokelab.demo.multimodule.core.data.Data175Repository 
import com.mokelab.demo.multimodule.core.data.Data176Repository 
import com.mokelab.demo.multimodule.core.data.Data177Repository 
import com.mokelab.demo.multimodule.core.data.Data178Repository 
import com.mokelab.demo.multimodule.core.data.Data179Repository 
import com.mokelab.demo.multimodule.core.data.Data180Repository 

import javax.inject.Inject

@HiltViewModel
class Screen018ViewModel @Inject constructor(
    private val repo1: Data171Repository,
    private val repo2: Data172Repository,
    private val repo3: Data173Repository,
    private val repo4: Data174Repository,
    private val repo5: Data175Repository,
    private val repo6: Data176Repository,
    private val repo7: Data177Repository,
    private val repo8: Data178Repository,
    private val repo9: Data179Repository,
    private val repo10: Data180Repository,

): ViewModel() {
}
