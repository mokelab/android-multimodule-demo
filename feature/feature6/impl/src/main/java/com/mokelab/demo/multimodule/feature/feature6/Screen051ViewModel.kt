package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data501Repository
import com.mokelab.demo.multimodule.core.data.Data502Repository
import com.mokelab.demo.multimodule.core.data.Data503Repository
import com.mokelab.demo.multimodule.core.data.Data504Repository
import com.mokelab.demo.multimodule.core.data.Data505Repository
import com.mokelab.demo.multimodule.core.data.Data506Repository
import com.mokelab.demo.multimodule.core.data.Data507Repository
import com.mokelab.demo.multimodule.core.data.Data508Repository
import com.mokelab.demo.multimodule.core.data.Data509Repository
import com.mokelab.demo.multimodule.core.data.Data510Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen051ViewModel @Inject constructor(
    private val repo1: Data501Repository,
    private val repo2: Data502Repository,
    private val repo3: Data503Repository,
    private val repo4: Data504Repository,
    private val repo5: Data505Repository,
    private val repo6: Data506Repository,
    private val repo7: Data507Repository,
    private val repo8: Data508Repository,
    private val repo9: Data509Repository,
    private val repo10: Data510Repository,

    ) : ViewModel() {
}
