package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data891Repository
import com.mokelab.demo.multimodule.core.data.Data892Repository
import com.mokelab.demo.multimodule.core.data.Data893Repository
import com.mokelab.demo.multimodule.core.data.Data894Repository
import com.mokelab.demo.multimodule.core.data.Data895Repository
import com.mokelab.demo.multimodule.core.data.Data896Repository
import com.mokelab.demo.multimodule.core.data.Data897Repository
import com.mokelab.demo.multimodule.core.data.Data898Repository
import com.mokelab.demo.multimodule.core.data.Data899Repository
import com.mokelab.demo.multimodule.core.data.Data900Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen090ViewModel @Inject constructor(
    private val repo1: Data891Repository,
    private val repo2: Data892Repository,
    private val repo3: Data893Repository,
    private val repo4: Data894Repository,
    private val repo5: Data895Repository,
    private val repo6: Data896Repository,
    private val repo7: Data897Repository,
    private val repo8: Data898Repository,
    private val repo9: Data899Repository,
    private val repo10: Data900Repository,

    ) : ViewModel() {
}
