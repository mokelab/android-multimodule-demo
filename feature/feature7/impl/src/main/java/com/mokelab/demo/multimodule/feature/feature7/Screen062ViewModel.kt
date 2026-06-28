package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data611Repository
import com.mokelab.demo.multimodule.core.data.Data612Repository
import com.mokelab.demo.multimodule.core.data.Data613Repository
import com.mokelab.demo.multimodule.core.data.Data614Repository
import com.mokelab.demo.multimodule.core.data.Data615Repository
import com.mokelab.demo.multimodule.core.data.Data616Repository
import com.mokelab.demo.multimodule.core.data.Data617Repository
import com.mokelab.demo.multimodule.core.data.Data618Repository
import com.mokelab.demo.multimodule.core.data.Data619Repository
import com.mokelab.demo.multimodule.core.data.Data620Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen062ViewModel @Inject constructor(
    private val repo1: Data611Repository,
    private val repo2: Data612Repository,
    private val repo3: Data613Repository,
    private val repo4: Data614Repository,
    private val repo5: Data615Repository,
    private val repo6: Data616Repository,
    private val repo7: Data617Repository,
    private val repo8: Data618Repository,
    private val repo9: Data619Repository,
    private val repo10: Data620Repository,

    ) : ViewModel() {
}
