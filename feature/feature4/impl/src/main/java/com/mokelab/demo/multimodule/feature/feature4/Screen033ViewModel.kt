package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data321Repository
import com.mokelab.demo.multimodule.core.data.Data322Repository
import com.mokelab.demo.multimodule.core.data.Data323Repository
import com.mokelab.demo.multimodule.core.data.Data324Repository
import com.mokelab.demo.multimodule.core.data.Data325Repository
import com.mokelab.demo.multimodule.core.data.Data326Repository
import com.mokelab.demo.multimodule.core.data.Data327Repository
import com.mokelab.demo.multimodule.core.data.Data328Repository
import com.mokelab.demo.multimodule.core.data.Data329Repository
import com.mokelab.demo.multimodule.core.data.Data330Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen033ViewModel @Inject constructor(
    private val repo1: Data321Repository,
    private val repo2: Data322Repository,
    private val repo3: Data323Repository,
    private val repo4: Data324Repository,
    private val repo5: Data325Repository,
    private val repo6: Data326Repository,
    private val repo7: Data327Repository,
    private val repo8: Data328Repository,
    private val repo9: Data329Repository,
    private val repo10: Data330Repository,

    ) : ViewModel() {
}
