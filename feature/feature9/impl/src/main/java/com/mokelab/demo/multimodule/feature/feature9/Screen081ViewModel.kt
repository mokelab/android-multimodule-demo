package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data801Repository
import com.mokelab.demo.multimodule.core.data.Data802Repository
import com.mokelab.demo.multimodule.core.data.Data803Repository
import com.mokelab.demo.multimodule.core.data.Data804Repository
import com.mokelab.demo.multimodule.core.data.Data805Repository
import com.mokelab.demo.multimodule.core.data.Data806Repository
import com.mokelab.demo.multimodule.core.data.Data807Repository
import com.mokelab.demo.multimodule.core.data.Data808Repository
import com.mokelab.demo.multimodule.core.data.Data809Repository
import com.mokelab.demo.multimodule.core.data.Data810Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen081ViewModel @Inject constructor(
    private val repo1: Data801Repository,
    private val repo2: Data802Repository,
    private val repo3: Data803Repository,
    private val repo4: Data804Repository,
    private val repo5: Data805Repository,
    private val repo6: Data806Repository,
    private val repo7: Data807Repository,
    private val repo8: Data808Repository,
    private val repo9: Data809Repository,
    private val repo10: Data810Repository,

    ) : ViewModel() {
}
