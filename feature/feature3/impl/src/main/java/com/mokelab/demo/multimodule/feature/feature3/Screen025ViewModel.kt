package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data241Repository
import com.mokelab.demo.multimodule.core.data.Data242Repository
import com.mokelab.demo.multimodule.core.data.Data243Repository
import com.mokelab.demo.multimodule.core.data.Data244Repository
import com.mokelab.demo.multimodule.core.data.Data245Repository
import com.mokelab.demo.multimodule.core.data.Data246Repository
import com.mokelab.demo.multimodule.core.data.Data247Repository
import com.mokelab.demo.multimodule.core.data.Data248Repository
import com.mokelab.demo.multimodule.core.data.Data249Repository
import com.mokelab.demo.multimodule.core.data.Data250Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen025ViewModel @Inject constructor(
    private val repo1: Data241Repository,
    private val repo2: Data242Repository,
    private val repo3: Data243Repository,
    private val repo4: Data244Repository,
    private val repo5: Data245Repository,
    private val repo6: Data246Repository,
    private val repo7: Data247Repository,
    private val repo8: Data248Repository,
    private val repo9: Data249Repository,
    private val repo10: Data250Repository,

    ) : ViewModel() {
}
