package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data971Repository
import com.mokelab.demo.multimodule.core.data.Data972Repository
import com.mokelab.demo.multimodule.core.data.Data973Repository
import com.mokelab.demo.multimodule.core.data.Data974Repository
import com.mokelab.demo.multimodule.core.data.Data975Repository
import com.mokelab.demo.multimodule.core.data.Data976Repository
import com.mokelab.demo.multimodule.core.data.Data977Repository
import com.mokelab.demo.multimodule.core.data.Data978Repository
import com.mokelab.demo.multimodule.core.data.Data979Repository
import com.mokelab.demo.multimodule.core.data.Data980Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen098ViewModel @Inject constructor(
    private val repo1: Data971Repository,
    private val repo2: Data972Repository,
    private val repo3: Data973Repository,
    private val repo4: Data974Repository,
    private val repo5: Data975Repository,
    private val repo6: Data976Repository,
    private val repo7: Data977Repository,
    private val repo8: Data978Repository,
    private val repo9: Data979Repository,
    private val repo10: Data980Repository,

    ) : ViewModel() {
}
