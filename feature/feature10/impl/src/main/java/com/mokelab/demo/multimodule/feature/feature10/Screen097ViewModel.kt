package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data961Repository
import com.mokelab.demo.multimodule.core.data.Data962Repository
import com.mokelab.demo.multimodule.core.data.Data963Repository
import com.mokelab.demo.multimodule.core.data.Data964Repository
import com.mokelab.demo.multimodule.core.data.Data965Repository
import com.mokelab.demo.multimodule.core.data.Data966Repository
import com.mokelab.demo.multimodule.core.data.Data967Repository
import com.mokelab.demo.multimodule.core.data.Data968Repository
import com.mokelab.demo.multimodule.core.data.Data969Repository
import com.mokelab.demo.multimodule.core.data.Data970Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen097ViewModel @Inject constructor(
    private val repo1: Data961Repository,
    private val repo2: Data962Repository,
    private val repo3: Data963Repository,
    private val repo4: Data964Repository,
    private val repo5: Data965Repository,
    private val repo6: Data966Repository,
    private val repo7: Data967Repository,
    private val repo8: Data968Repository,
    private val repo9: Data969Repository,
    private val repo10: Data970Repository,

    ) : ViewModel() {
}
