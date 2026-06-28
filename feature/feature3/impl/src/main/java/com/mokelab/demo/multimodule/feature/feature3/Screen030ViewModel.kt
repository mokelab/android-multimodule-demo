package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data291Repository 
import com.mokelab.demo.multimodule.core.data.Data292Repository 
import com.mokelab.demo.multimodule.core.data.Data293Repository 
import com.mokelab.demo.multimodule.core.data.Data294Repository 
import com.mokelab.demo.multimodule.core.data.Data295Repository 
import com.mokelab.demo.multimodule.core.data.Data296Repository 
import com.mokelab.demo.multimodule.core.data.Data297Repository 
import com.mokelab.demo.multimodule.core.data.Data298Repository 
import com.mokelab.demo.multimodule.core.data.Data299Repository 
import com.mokelab.demo.multimodule.core.data.Data300Repository 

import javax.inject.Inject

@HiltViewModel
class Screen030ViewModel @Inject constructor(
    private val repo1: Data291Repository,
    private val repo2: Data292Repository,
    private val repo3: Data293Repository,
    private val repo4: Data294Repository,
    private val repo5: Data295Repository,
    private val repo6: Data296Repository,
    private val repo7: Data297Repository,
    private val repo8: Data298Repository,
    private val repo9: Data299Repository,
    private val repo10: Data300Repository,

): ViewModel() {
}
