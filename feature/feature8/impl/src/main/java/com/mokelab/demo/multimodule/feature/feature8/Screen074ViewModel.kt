package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data731Repository
import com.mokelab.demo.multimodule.core.data.Data732Repository
import com.mokelab.demo.multimodule.core.data.Data733Repository
import com.mokelab.demo.multimodule.core.data.Data734Repository
import com.mokelab.demo.multimodule.core.data.Data735Repository
import com.mokelab.demo.multimodule.core.data.Data736Repository
import com.mokelab.demo.multimodule.core.data.Data737Repository
import com.mokelab.demo.multimodule.core.data.Data738Repository
import com.mokelab.demo.multimodule.core.data.Data739Repository
import com.mokelab.demo.multimodule.core.data.Data740Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen074ViewModel @Inject constructor(
    private val repo1: Data731Repository,
    private val repo2: Data732Repository,
    private val repo3: Data733Repository,
    private val repo4: Data734Repository,
    private val repo5: Data735Repository,
    private val repo6: Data736Repository,
    private val repo7: Data737Repository,
    private val repo8: Data738Repository,
    private val repo9: Data739Repository,
    private val repo10: Data740Repository,

    ) : ViewModel() {
}
