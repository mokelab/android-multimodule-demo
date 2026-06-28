package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data601Repository
import com.mokelab.demo.multimodule.core.data.Data602Repository
import com.mokelab.demo.multimodule.core.data.Data603Repository
import com.mokelab.demo.multimodule.core.data.Data604Repository
import com.mokelab.demo.multimodule.core.data.Data605Repository
import com.mokelab.demo.multimodule.core.data.Data606Repository
import com.mokelab.demo.multimodule.core.data.Data607Repository
import com.mokelab.demo.multimodule.core.data.Data608Repository
import com.mokelab.demo.multimodule.core.data.Data609Repository
import com.mokelab.demo.multimodule.core.data.Data610Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen061ViewModel @Inject constructor(
    private val repo1: Data601Repository,
    private val repo2: Data602Repository,
    private val repo3: Data603Repository,
    private val repo4: Data604Repository,
    private val repo5: Data605Repository,
    private val repo6: Data606Repository,
    private val repo7: Data607Repository,
    private val repo8: Data608Repository,
    private val repo9: Data609Repository,
    private val repo10: Data610Repository,

    ) : ViewModel() {
}
