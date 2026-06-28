package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data331Repository
import com.mokelab.demo.multimodule.core.data.Data332Repository
import com.mokelab.demo.multimodule.core.data.Data333Repository
import com.mokelab.demo.multimodule.core.data.Data334Repository
import com.mokelab.demo.multimodule.core.data.Data335Repository
import com.mokelab.demo.multimodule.core.data.Data336Repository
import com.mokelab.demo.multimodule.core.data.Data337Repository
import com.mokelab.demo.multimodule.core.data.Data338Repository
import com.mokelab.demo.multimodule.core.data.Data339Repository
import com.mokelab.demo.multimodule.core.data.Data340Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen034ViewModel @Inject constructor(
    private val repo1: Data331Repository,
    private val repo2: Data332Repository,
    private val repo3: Data333Repository,
    private val repo4: Data334Repository,
    private val repo5: Data335Repository,
    private val repo6: Data336Repository,
    private val repo7: Data337Repository,
    private val repo8: Data338Repository,
    private val repo9: Data339Repository,
    private val repo10: Data340Repository,

    ) : ViewModel() {
}
