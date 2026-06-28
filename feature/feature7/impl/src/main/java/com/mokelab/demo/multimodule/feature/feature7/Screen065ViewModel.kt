package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data641Repository
import com.mokelab.demo.multimodule.core.data.Data642Repository
import com.mokelab.demo.multimodule.core.data.Data643Repository
import com.mokelab.demo.multimodule.core.data.Data644Repository
import com.mokelab.demo.multimodule.core.data.Data645Repository
import com.mokelab.demo.multimodule.core.data.Data646Repository
import com.mokelab.demo.multimodule.core.data.Data647Repository
import com.mokelab.demo.multimodule.core.data.Data648Repository
import com.mokelab.demo.multimodule.core.data.Data649Repository
import com.mokelab.demo.multimodule.core.data.Data650Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen065ViewModel @Inject constructor(
    private val repo1: Data641Repository,
    private val repo2: Data642Repository,
    private val repo3: Data643Repository,
    private val repo4: Data644Repository,
    private val repo5: Data645Repository,
    private val repo6: Data646Repository,
    private val repo7: Data647Repository,
    private val repo8: Data648Repository,
    private val repo9: Data649Repository,
    private val repo10: Data650Repository,

    ) : ViewModel() {
}
