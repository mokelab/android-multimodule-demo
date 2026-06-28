package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data621Repository
import com.mokelab.demo.multimodule.core.data.Data622Repository
import com.mokelab.demo.multimodule.core.data.Data623Repository
import com.mokelab.demo.multimodule.core.data.Data624Repository
import com.mokelab.demo.multimodule.core.data.Data625Repository
import com.mokelab.demo.multimodule.core.data.Data626Repository
import com.mokelab.demo.multimodule.core.data.Data627Repository
import com.mokelab.demo.multimodule.core.data.Data628Repository
import com.mokelab.demo.multimodule.core.data.Data629Repository
import com.mokelab.demo.multimodule.core.data.Data630Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen063ViewModel @Inject constructor(
    private val repo1: Data621Repository,
    private val repo2: Data622Repository,
    private val repo3: Data623Repository,
    private val repo4: Data624Repository,
    private val repo5: Data625Repository,
    private val repo6: Data626Repository,
    private val repo7: Data627Repository,
    private val repo8: Data628Repository,
    private val repo9: Data629Repository,
    private val repo10: Data630Repository,

    ) : ViewModel() {
}
