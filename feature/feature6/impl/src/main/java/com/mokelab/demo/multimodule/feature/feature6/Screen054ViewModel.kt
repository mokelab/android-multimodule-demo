package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data531Repository
import com.mokelab.demo.multimodule.core.data.Data532Repository
import com.mokelab.demo.multimodule.core.data.Data533Repository
import com.mokelab.demo.multimodule.core.data.Data534Repository
import com.mokelab.demo.multimodule.core.data.Data535Repository
import com.mokelab.demo.multimodule.core.data.Data536Repository
import com.mokelab.demo.multimodule.core.data.Data537Repository
import com.mokelab.demo.multimodule.core.data.Data538Repository
import com.mokelab.demo.multimodule.core.data.Data539Repository
import com.mokelab.demo.multimodule.core.data.Data540Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen054ViewModel @Inject constructor(
    private val repo1: Data531Repository,
    private val repo2: Data532Repository,
    private val repo3: Data533Repository,
    private val repo4: Data534Repository,
    private val repo5: Data535Repository,
    private val repo6: Data536Repository,
    private val repo7: Data537Repository,
    private val repo8: Data538Repository,
    private val repo9: Data539Repository,
    private val repo10: Data540Repository,

    ) : ViewModel() {
}
