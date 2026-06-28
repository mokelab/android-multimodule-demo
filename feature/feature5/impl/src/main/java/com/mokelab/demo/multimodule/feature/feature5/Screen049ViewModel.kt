package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data481Repository
import com.mokelab.demo.multimodule.core.data.Data482Repository
import com.mokelab.demo.multimodule.core.data.Data483Repository
import com.mokelab.demo.multimodule.core.data.Data484Repository
import com.mokelab.demo.multimodule.core.data.Data485Repository
import com.mokelab.demo.multimodule.core.data.Data486Repository
import com.mokelab.demo.multimodule.core.data.Data487Repository
import com.mokelab.demo.multimodule.core.data.Data488Repository
import com.mokelab.demo.multimodule.core.data.Data489Repository
import com.mokelab.demo.multimodule.core.data.Data490Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen049ViewModel @Inject constructor(
    private val repo1: Data481Repository,
    private val repo2: Data482Repository,
    private val repo3: Data483Repository,
    private val repo4: Data484Repository,
    private val repo5: Data485Repository,
    private val repo6: Data486Repository,
    private val repo7: Data487Repository,
    private val repo8: Data488Repository,
    private val repo9: Data489Repository,
    private val repo10: Data490Repository,

    ) : ViewModel() {
}
