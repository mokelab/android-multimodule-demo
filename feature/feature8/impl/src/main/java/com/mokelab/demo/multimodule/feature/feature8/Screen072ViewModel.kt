package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data711Repository
import com.mokelab.demo.multimodule.core.data.Data712Repository
import com.mokelab.demo.multimodule.core.data.Data713Repository
import com.mokelab.demo.multimodule.core.data.Data714Repository
import com.mokelab.demo.multimodule.core.data.Data715Repository
import com.mokelab.demo.multimodule.core.data.Data716Repository
import com.mokelab.demo.multimodule.core.data.Data717Repository
import com.mokelab.demo.multimodule.core.data.Data718Repository
import com.mokelab.demo.multimodule.core.data.Data719Repository
import com.mokelab.demo.multimodule.core.data.Data720Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen072ViewModel @Inject constructor(
    private val repo1: Data711Repository,
    private val repo2: Data712Repository,
    private val repo3: Data713Repository,
    private val repo4: Data714Repository,
    private val repo5: Data715Repository,
    private val repo6: Data716Repository,
    private val repo7: Data717Repository,
    private val repo8: Data718Repository,
    private val repo9: Data719Repository,
    private val repo10: Data720Repository,

    ) : ViewModel() {
}
