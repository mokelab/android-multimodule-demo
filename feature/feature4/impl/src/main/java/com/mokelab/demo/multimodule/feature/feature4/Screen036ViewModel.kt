package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data351Repository 
import com.mokelab.demo.multimodule.core.data.Data352Repository 
import com.mokelab.demo.multimodule.core.data.Data353Repository 
import com.mokelab.demo.multimodule.core.data.Data354Repository 
import com.mokelab.demo.multimodule.core.data.Data355Repository 
import com.mokelab.demo.multimodule.core.data.Data356Repository 
import com.mokelab.demo.multimodule.core.data.Data357Repository 
import com.mokelab.demo.multimodule.core.data.Data358Repository 
import com.mokelab.demo.multimodule.core.data.Data359Repository 
import com.mokelab.demo.multimodule.core.data.Data360Repository 

import javax.inject.Inject

@HiltViewModel
class Screen036ViewModel @Inject constructor(
    private val repo1: Data351Repository,
    private val repo2: Data352Repository,
    private val repo3: Data353Repository,
    private val repo4: Data354Repository,
    private val repo5: Data355Repository,
    private val repo6: Data356Repository,
    private val repo7: Data357Repository,
    private val repo8: Data358Repository,
    private val repo9: Data359Repository,
    private val repo10: Data360Repository,

): ViewModel() {
}
