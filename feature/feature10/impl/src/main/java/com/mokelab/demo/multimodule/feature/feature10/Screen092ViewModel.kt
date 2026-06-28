package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data911Repository
import com.mokelab.demo.multimodule.core.data.Data912Repository
import com.mokelab.demo.multimodule.core.data.Data913Repository
import com.mokelab.demo.multimodule.core.data.Data914Repository
import com.mokelab.demo.multimodule.core.data.Data915Repository
import com.mokelab.demo.multimodule.core.data.Data916Repository
import com.mokelab.demo.multimodule.core.data.Data917Repository
import com.mokelab.demo.multimodule.core.data.Data918Repository
import com.mokelab.demo.multimodule.core.data.Data919Repository
import com.mokelab.demo.multimodule.core.data.Data920Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen092ViewModel @Inject constructor(
    private val repo1: Data911Repository,
    private val repo2: Data912Repository,
    private val repo3: Data913Repository,
    private val repo4: Data914Repository,
    private val repo5: Data915Repository,
    private val repo6: Data916Repository,
    private val repo7: Data917Repository,
    private val repo8: Data918Repository,
    private val repo9: Data919Repository,
    private val repo10: Data920Repository,

    ) : ViewModel() {
}
