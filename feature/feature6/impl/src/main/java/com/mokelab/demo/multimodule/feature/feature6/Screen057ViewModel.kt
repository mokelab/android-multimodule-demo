package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data561Repository
import com.mokelab.demo.multimodule.core.data.Data562Repository
import com.mokelab.demo.multimodule.core.data.Data563Repository
import com.mokelab.demo.multimodule.core.data.Data564Repository
import com.mokelab.demo.multimodule.core.data.Data565Repository
import com.mokelab.demo.multimodule.core.data.Data566Repository
import com.mokelab.demo.multimodule.core.data.Data567Repository
import com.mokelab.demo.multimodule.core.data.Data568Repository
import com.mokelab.demo.multimodule.core.data.Data569Repository
import com.mokelab.demo.multimodule.core.data.Data570Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen057ViewModel @Inject constructor(
    private val repo1: Data561Repository,
    private val repo2: Data562Repository,
    private val repo3: Data563Repository,
    private val repo4: Data564Repository,
    private val repo5: Data565Repository,
    private val repo6: Data566Repository,
    private val repo7: Data567Repository,
    private val repo8: Data568Repository,
    private val repo9: Data569Repository,
    private val repo10: Data570Repository,

    ) : ViewModel() {
}
