package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data701Repository
import com.mokelab.demo.multimodule.core.data.Data702Repository
import com.mokelab.demo.multimodule.core.data.Data703Repository
import com.mokelab.demo.multimodule.core.data.Data704Repository
import com.mokelab.demo.multimodule.core.data.Data705Repository
import com.mokelab.demo.multimodule.core.data.Data706Repository
import com.mokelab.demo.multimodule.core.data.Data707Repository
import com.mokelab.demo.multimodule.core.data.Data708Repository
import com.mokelab.demo.multimodule.core.data.Data709Repository
import com.mokelab.demo.multimodule.core.data.Data710Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen071ViewModel @Inject constructor(
    private val repo1: Data701Repository,
    private val repo2: Data702Repository,
    private val repo3: Data703Repository,
    private val repo4: Data704Repository,
    private val repo5: Data705Repository,
    private val repo6: Data706Repository,
    private val repo7: Data707Repository,
    private val repo8: Data708Repository,
    private val repo9: Data709Repository,
    private val repo10: Data710Repository,

    ) : ViewModel() {
}
