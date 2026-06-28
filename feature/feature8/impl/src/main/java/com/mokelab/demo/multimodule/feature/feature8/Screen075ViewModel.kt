package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data741Repository
import com.mokelab.demo.multimodule.core.data.Data742Repository
import com.mokelab.demo.multimodule.core.data.Data743Repository
import com.mokelab.demo.multimodule.core.data.Data744Repository
import com.mokelab.demo.multimodule.core.data.Data745Repository
import com.mokelab.demo.multimodule.core.data.Data746Repository
import com.mokelab.demo.multimodule.core.data.Data747Repository
import com.mokelab.demo.multimodule.core.data.Data748Repository
import com.mokelab.demo.multimodule.core.data.Data749Repository
import com.mokelab.demo.multimodule.core.data.Data750Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen075ViewModel @Inject constructor(
    private val repo1: Data741Repository,
    private val repo2: Data742Repository,
    private val repo3: Data743Repository,
    private val repo4: Data744Repository,
    private val repo5: Data745Repository,
    private val repo6: Data746Repository,
    private val repo7: Data747Repository,
    private val repo8: Data748Repository,
    private val repo9: Data749Repository,
    private val repo10: Data750Repository,

    ) : ViewModel() {
}
