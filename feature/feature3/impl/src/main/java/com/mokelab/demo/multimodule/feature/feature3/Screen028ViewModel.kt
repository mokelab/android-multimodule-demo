package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data271Repository 
import com.mokelab.demo.multimodule.core.data.Data272Repository 
import com.mokelab.demo.multimodule.core.data.Data273Repository 
import com.mokelab.demo.multimodule.core.data.Data274Repository 
import com.mokelab.demo.multimodule.core.data.Data275Repository 
import com.mokelab.demo.multimodule.core.data.Data276Repository 
import com.mokelab.demo.multimodule.core.data.Data277Repository 
import com.mokelab.demo.multimodule.core.data.Data278Repository 
import com.mokelab.demo.multimodule.core.data.Data279Repository 
import com.mokelab.demo.multimodule.core.data.Data280Repository 

import javax.inject.Inject

@HiltViewModel
class Screen028ViewModel @Inject constructor(
    private val repo1: Data271Repository,
    private val repo2: Data272Repository,
    private val repo3: Data273Repository,
    private val repo4: Data274Repository,
    private val repo5: Data275Repository,
    private val repo6: Data276Repository,
    private val repo7: Data277Repository,
    private val repo8: Data278Repository,
    private val repo9: Data279Repository,
    private val repo10: Data280Repository,

): ViewModel() {
}
