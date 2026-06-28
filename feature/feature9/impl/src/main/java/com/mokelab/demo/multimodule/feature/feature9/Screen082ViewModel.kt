package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data811Repository
import com.mokelab.demo.multimodule.core.data.Data812Repository
import com.mokelab.demo.multimodule.core.data.Data813Repository
import com.mokelab.demo.multimodule.core.data.Data814Repository
import com.mokelab.demo.multimodule.core.data.Data815Repository
import com.mokelab.demo.multimodule.core.data.Data816Repository
import com.mokelab.demo.multimodule.core.data.Data817Repository
import com.mokelab.demo.multimodule.core.data.Data818Repository
import com.mokelab.demo.multimodule.core.data.Data819Repository
import com.mokelab.demo.multimodule.core.data.Data820Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen082ViewModel @Inject constructor(
    private val repo1: Data811Repository,
    private val repo2: Data812Repository,
    private val repo3: Data813Repository,
    private val repo4: Data814Repository,
    private val repo5: Data815Repository,
    private val repo6: Data816Repository,
    private val repo7: Data817Repository,
    private val repo8: Data818Repository,
    private val repo9: Data819Repository,
    private val repo10: Data820Repository,

    ) : ViewModel() {
}
