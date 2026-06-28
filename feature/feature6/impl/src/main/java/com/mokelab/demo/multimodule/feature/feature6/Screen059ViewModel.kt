package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data581Repository
import com.mokelab.demo.multimodule.core.data.Data582Repository
import com.mokelab.demo.multimodule.core.data.Data583Repository
import com.mokelab.demo.multimodule.core.data.Data584Repository
import com.mokelab.demo.multimodule.core.data.Data585Repository
import com.mokelab.demo.multimodule.core.data.Data586Repository
import com.mokelab.demo.multimodule.core.data.Data587Repository
import com.mokelab.demo.multimodule.core.data.Data588Repository
import com.mokelab.demo.multimodule.core.data.Data589Repository
import com.mokelab.demo.multimodule.core.data.Data590Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen059ViewModel @Inject constructor(
    private val repo1: Data581Repository,
    private val repo2: Data582Repository,
    private val repo3: Data583Repository,
    private val repo4: Data584Repository,
    private val repo5: Data585Repository,
    private val repo6: Data586Repository,
    private val repo7: Data587Repository,
    private val repo8: Data588Repository,
    private val repo9: Data589Repository,
    private val repo10: Data590Repository,

    ) : ViewModel() {
}
