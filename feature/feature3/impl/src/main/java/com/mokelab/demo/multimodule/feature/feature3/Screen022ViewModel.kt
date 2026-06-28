package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data211Repository
import com.mokelab.demo.multimodule.core.data.Data212Repository
import com.mokelab.demo.multimodule.core.data.Data213Repository
import com.mokelab.demo.multimodule.core.data.Data214Repository
import com.mokelab.demo.multimodule.core.data.Data215Repository
import com.mokelab.demo.multimodule.core.data.Data216Repository
import com.mokelab.demo.multimodule.core.data.Data217Repository
import com.mokelab.demo.multimodule.core.data.Data218Repository
import com.mokelab.demo.multimodule.core.data.Data219Repository
import com.mokelab.demo.multimodule.core.data.Data220Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen022ViewModel @Inject constructor(
    private val repo1: Data211Repository,
    private val repo2: Data212Repository,
    private val repo3: Data213Repository,
    private val repo4: Data214Repository,
    private val repo5: Data215Repository,
    private val repo6: Data216Repository,
    private val repo7: Data217Repository,
    private val repo8: Data218Repository,
    private val repo9: Data219Repository,
    private val repo10: Data220Repository,

    ) : ViewModel() {
}
