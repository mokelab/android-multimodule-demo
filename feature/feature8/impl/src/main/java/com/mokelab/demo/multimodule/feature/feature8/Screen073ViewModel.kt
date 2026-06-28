package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data721Repository
import com.mokelab.demo.multimodule.core.data.Data722Repository
import com.mokelab.demo.multimodule.core.data.Data723Repository
import com.mokelab.demo.multimodule.core.data.Data724Repository
import com.mokelab.demo.multimodule.core.data.Data725Repository
import com.mokelab.demo.multimodule.core.data.Data726Repository
import com.mokelab.demo.multimodule.core.data.Data727Repository
import com.mokelab.demo.multimodule.core.data.Data728Repository
import com.mokelab.demo.multimodule.core.data.Data729Repository
import com.mokelab.demo.multimodule.core.data.Data730Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen073ViewModel @Inject constructor(
    private val repo1: Data721Repository,
    private val repo2: Data722Repository,
    private val repo3: Data723Repository,
    private val repo4: Data724Repository,
    private val repo5: Data725Repository,
    private val repo6: Data726Repository,
    private val repo7: Data727Repository,
    private val repo8: Data728Repository,
    private val repo9: Data729Repository,
    private val repo10: Data730Repository,

    ) : ViewModel() {
}
