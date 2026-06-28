package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data791Repository
import com.mokelab.demo.multimodule.core.data.Data792Repository
import com.mokelab.demo.multimodule.core.data.Data793Repository
import com.mokelab.demo.multimodule.core.data.Data794Repository
import com.mokelab.demo.multimodule.core.data.Data795Repository
import com.mokelab.demo.multimodule.core.data.Data796Repository
import com.mokelab.demo.multimodule.core.data.Data797Repository
import com.mokelab.demo.multimodule.core.data.Data798Repository
import com.mokelab.demo.multimodule.core.data.Data799Repository
import com.mokelab.demo.multimodule.core.data.Data800Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen080ViewModel @Inject constructor(
    private val repo1: Data791Repository,
    private val repo2: Data792Repository,
    private val repo3: Data793Repository,
    private val repo4: Data794Repository,
    private val repo5: Data795Repository,
    private val repo6: Data796Repository,
    private val repo7: Data797Repository,
    private val repo8: Data798Repository,
    private val repo9: Data799Repository,
    private val repo10: Data800Repository,

    ) : ViewModel() {
}
