package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data751Repository
import com.mokelab.demo.multimodule.core.data.Data752Repository
import com.mokelab.demo.multimodule.core.data.Data753Repository
import com.mokelab.demo.multimodule.core.data.Data754Repository
import com.mokelab.demo.multimodule.core.data.Data755Repository
import com.mokelab.demo.multimodule.core.data.Data756Repository
import com.mokelab.demo.multimodule.core.data.Data757Repository
import com.mokelab.demo.multimodule.core.data.Data758Repository
import com.mokelab.demo.multimodule.core.data.Data759Repository
import com.mokelab.demo.multimodule.core.data.Data760Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen076ViewModel @Inject constructor(
    private val repo1: Data751Repository,
    private val repo2: Data752Repository,
    private val repo3: Data753Repository,
    private val repo4: Data754Repository,
    private val repo5: Data755Repository,
    private val repo6: Data756Repository,
    private val repo7: Data757Repository,
    private val repo8: Data758Repository,
    private val repo9: Data759Repository,
    private val repo10: Data760Repository,

    ) : ViewModel() {
}
