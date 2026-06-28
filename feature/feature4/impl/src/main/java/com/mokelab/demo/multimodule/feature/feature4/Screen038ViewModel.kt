package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data371Repository 
import com.mokelab.demo.multimodule.core.data.Data372Repository 
import com.mokelab.demo.multimodule.core.data.Data373Repository 
import com.mokelab.demo.multimodule.core.data.Data374Repository 
import com.mokelab.demo.multimodule.core.data.Data375Repository 
import com.mokelab.demo.multimodule.core.data.Data376Repository 
import com.mokelab.demo.multimodule.core.data.Data377Repository 
import com.mokelab.demo.multimodule.core.data.Data378Repository 
import com.mokelab.demo.multimodule.core.data.Data379Repository 
import com.mokelab.demo.multimodule.core.data.Data380Repository 

import javax.inject.Inject

@HiltViewModel
class Screen038ViewModel @Inject constructor(
    private val repo1: Data371Repository,
    private val repo2: Data372Repository,
    private val repo3: Data373Repository,
    private val repo4: Data374Repository,
    private val repo5: Data375Repository,
    private val repo6: Data376Repository,
    private val repo7: Data377Repository,
    private val repo8: Data378Repository,
    private val repo9: Data379Repository,
    private val repo10: Data380Repository,

): ViewModel() {
}
