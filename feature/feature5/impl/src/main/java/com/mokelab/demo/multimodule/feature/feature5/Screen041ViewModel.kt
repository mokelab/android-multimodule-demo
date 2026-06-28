package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data401Repository
import com.mokelab.demo.multimodule.core.data.Data402Repository
import com.mokelab.demo.multimodule.core.data.Data403Repository
import com.mokelab.demo.multimodule.core.data.Data404Repository
import com.mokelab.demo.multimodule.core.data.Data405Repository
import com.mokelab.demo.multimodule.core.data.Data406Repository
import com.mokelab.demo.multimodule.core.data.Data407Repository
import com.mokelab.demo.multimodule.core.data.Data408Repository
import com.mokelab.demo.multimodule.core.data.Data409Repository
import com.mokelab.demo.multimodule.core.data.Data410Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen041ViewModel @Inject constructor(
    private val repo1: Data401Repository,
    private val repo2: Data402Repository,
    private val repo3: Data403Repository,
    private val repo4: Data404Repository,
    private val repo5: Data405Repository,
    private val repo6: Data406Repository,
    private val repo7: Data407Repository,
    private val repo8: Data408Repository,
    private val repo9: Data409Repository,
    private val repo10: Data410Repository,

    ) : ViewModel() {
}
