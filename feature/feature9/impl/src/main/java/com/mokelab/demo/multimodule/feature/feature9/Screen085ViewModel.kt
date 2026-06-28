package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data841Repository
import com.mokelab.demo.multimodule.core.data.Data842Repository
import com.mokelab.demo.multimodule.core.data.Data843Repository
import com.mokelab.demo.multimodule.core.data.Data844Repository
import com.mokelab.demo.multimodule.core.data.Data845Repository
import com.mokelab.demo.multimodule.core.data.Data846Repository
import com.mokelab.demo.multimodule.core.data.Data847Repository
import com.mokelab.demo.multimodule.core.data.Data848Repository
import com.mokelab.demo.multimodule.core.data.Data849Repository
import com.mokelab.demo.multimodule.core.data.Data850Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen085ViewModel @Inject constructor(
    private val repo1: Data841Repository,
    private val repo2: Data842Repository,
    private val repo3: Data843Repository,
    private val repo4: Data844Repository,
    private val repo5: Data845Repository,
    private val repo6: Data846Repository,
    private val repo7: Data847Repository,
    private val repo8: Data848Repository,
    private val repo9: Data849Repository,
    private val repo10: Data850Repository,

    ) : ViewModel() {
}
