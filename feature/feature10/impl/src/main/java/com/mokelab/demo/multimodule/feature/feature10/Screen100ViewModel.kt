package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data001Repository
import com.mokelab.demo.multimodule.core.data.Data991Repository
import com.mokelab.demo.multimodule.core.data.Data992Repository
import com.mokelab.demo.multimodule.core.data.Data993Repository
import com.mokelab.demo.multimodule.core.data.Data994Repository
import com.mokelab.demo.multimodule.core.data.Data995Repository
import com.mokelab.demo.multimodule.core.data.Data996Repository
import com.mokelab.demo.multimodule.core.data.Data997Repository
import com.mokelab.demo.multimodule.core.data.Data998Repository
import com.mokelab.demo.multimodule.core.data.Data999Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen100ViewModel @Inject constructor(
    private val repo1: Data991Repository,
    private val repo2: Data992Repository,
    private val repo3: Data993Repository,
    private val repo4: Data994Repository,
    private val repo5: Data995Repository,
    private val repo6: Data996Repository,
    private val repo7: Data997Repository,
    private val repo8: Data998Repository,
    private val repo9: Data999Repository,
    private val repo10: Data001Repository,

    ) : ViewModel() {
}
