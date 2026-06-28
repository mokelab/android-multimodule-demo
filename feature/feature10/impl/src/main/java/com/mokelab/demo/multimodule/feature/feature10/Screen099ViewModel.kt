package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data981Repository
import com.mokelab.demo.multimodule.core.data.Data982Repository
import com.mokelab.demo.multimodule.core.data.Data983Repository
import com.mokelab.demo.multimodule.core.data.Data984Repository
import com.mokelab.demo.multimodule.core.data.Data985Repository
import com.mokelab.demo.multimodule.core.data.Data986Repository
import com.mokelab.demo.multimodule.core.data.Data987Repository
import com.mokelab.demo.multimodule.core.data.Data988Repository
import com.mokelab.demo.multimodule.core.data.Data989Repository
import com.mokelab.demo.multimodule.core.data.Data990Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen099ViewModel @Inject constructor(
    private val repo1: Data981Repository,
    private val repo2: Data982Repository,
    private val repo3: Data983Repository,
    private val repo4: Data984Repository,
    private val repo5: Data985Repository,
    private val repo6: Data986Repository,
    private val repo7: Data987Repository,
    private val repo8: Data988Repository,
    private val repo9: Data989Repository,
    private val repo10: Data990Repository,

    ) : ViewModel() {
}
