package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data361Repository 
import com.mokelab.demo.multimodule.core.data.Data362Repository 
import com.mokelab.demo.multimodule.core.data.Data363Repository 
import com.mokelab.demo.multimodule.core.data.Data364Repository 
import com.mokelab.demo.multimodule.core.data.Data365Repository 
import com.mokelab.demo.multimodule.core.data.Data366Repository 
import com.mokelab.demo.multimodule.core.data.Data367Repository 
import com.mokelab.demo.multimodule.core.data.Data368Repository 
import com.mokelab.demo.multimodule.core.data.Data369Repository 
import com.mokelab.demo.multimodule.core.data.Data370Repository 

import javax.inject.Inject

@HiltViewModel
class Screen037ViewModel @Inject constructor(
    private val repo1: Data361Repository,
    private val repo2: Data362Repository,
    private val repo3: Data363Repository,
    private val repo4: Data364Repository,
    private val repo5: Data365Repository,
    private val repo6: Data366Repository,
    private val repo7: Data367Repository,
    private val repo8: Data368Repository,
    private val repo9: Data369Repository,
    private val repo10: Data370Repository,

): ViewModel() {
}
