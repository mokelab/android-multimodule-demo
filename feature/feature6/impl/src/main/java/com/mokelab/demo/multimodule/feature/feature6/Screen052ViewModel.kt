package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data511Repository
import com.mokelab.demo.multimodule.core.data.Data512Repository
import com.mokelab.demo.multimodule.core.data.Data513Repository
import com.mokelab.demo.multimodule.core.data.Data514Repository
import com.mokelab.demo.multimodule.core.data.Data515Repository
import com.mokelab.demo.multimodule.core.data.Data516Repository
import com.mokelab.demo.multimodule.core.data.Data517Repository
import com.mokelab.demo.multimodule.core.data.Data518Repository
import com.mokelab.demo.multimodule.core.data.Data519Repository
import com.mokelab.demo.multimodule.core.data.Data520Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen052ViewModel @Inject constructor(
    private val repo1: Data511Repository,
    private val repo2: Data512Repository,
    private val repo3: Data513Repository,
    private val repo4: Data514Repository,
    private val repo5: Data515Repository,
    private val repo6: Data516Repository,
    private val repo7: Data517Repository,
    private val repo8: Data518Repository,
    private val repo9: Data519Repository,
    private val repo10: Data520Repository,

    ) : ViewModel() {
}
