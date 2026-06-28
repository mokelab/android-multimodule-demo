package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data821Repository
import com.mokelab.demo.multimodule.core.data.Data822Repository
import com.mokelab.demo.multimodule.core.data.Data823Repository
import com.mokelab.demo.multimodule.core.data.Data824Repository
import com.mokelab.demo.multimodule.core.data.Data825Repository
import com.mokelab.demo.multimodule.core.data.Data826Repository
import com.mokelab.demo.multimodule.core.data.Data827Repository
import com.mokelab.demo.multimodule.core.data.Data828Repository
import com.mokelab.demo.multimodule.core.data.Data829Repository
import com.mokelab.demo.multimodule.core.data.Data830Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen083ViewModel @Inject constructor(
    private val repo1: Data821Repository,
    private val repo2: Data822Repository,
    private val repo3: Data823Repository,
    private val repo4: Data824Repository,
    private val repo5: Data825Repository,
    private val repo6: Data826Repository,
    private val repo7: Data827Repository,
    private val repo8: Data828Repository,
    private val repo9: Data829Repository,
    private val repo10: Data830Repository,

    ) : ViewModel() {
}
