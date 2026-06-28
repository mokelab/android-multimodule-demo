package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data231Repository
import com.mokelab.demo.multimodule.core.data.Data232Repository
import com.mokelab.demo.multimodule.core.data.Data233Repository
import com.mokelab.demo.multimodule.core.data.Data234Repository
import com.mokelab.demo.multimodule.core.data.Data235Repository
import com.mokelab.demo.multimodule.core.data.Data236Repository
import com.mokelab.demo.multimodule.core.data.Data237Repository
import com.mokelab.demo.multimodule.core.data.Data238Repository
import com.mokelab.demo.multimodule.core.data.Data239Repository
import com.mokelab.demo.multimodule.core.data.Data240Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen024ViewModel @Inject constructor(
    private val repo1: Data231Repository,
    private val repo2: Data232Repository,
    private val repo3: Data233Repository,
    private val repo4: Data234Repository,
    private val repo5: Data235Repository,
    private val repo6: Data236Repository,
    private val repo7: Data237Repository,
    private val repo8: Data238Repository,
    private val repo9: Data239Repository,
    private val repo10: Data240Repository,

    ) : ViewModel() {
}
