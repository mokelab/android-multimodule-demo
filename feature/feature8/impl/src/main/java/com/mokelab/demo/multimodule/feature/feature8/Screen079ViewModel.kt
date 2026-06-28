package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data781Repository
import com.mokelab.demo.multimodule.core.data.Data782Repository
import com.mokelab.demo.multimodule.core.data.Data783Repository
import com.mokelab.demo.multimodule.core.data.Data784Repository
import com.mokelab.demo.multimodule.core.data.Data785Repository
import com.mokelab.demo.multimodule.core.data.Data786Repository
import com.mokelab.demo.multimodule.core.data.Data787Repository
import com.mokelab.demo.multimodule.core.data.Data788Repository
import com.mokelab.demo.multimodule.core.data.Data789Repository
import com.mokelab.demo.multimodule.core.data.Data790Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen079ViewModel @Inject constructor(
    private val repo1: Data781Repository,
    private val repo2: Data782Repository,
    private val repo3: Data783Repository,
    private val repo4: Data784Repository,
    private val repo5: Data785Repository,
    private val repo6: Data786Repository,
    private val repo7: Data787Repository,
    private val repo8: Data788Repository,
    private val repo9: Data789Repository,
    private val repo10: Data790Repository,

    ) : ViewModel() {
}
