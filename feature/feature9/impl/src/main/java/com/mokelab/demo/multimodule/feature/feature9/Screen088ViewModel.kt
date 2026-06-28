package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data871Repository
import com.mokelab.demo.multimodule.core.data.Data872Repository
import com.mokelab.demo.multimodule.core.data.Data873Repository
import com.mokelab.demo.multimodule.core.data.Data874Repository
import com.mokelab.demo.multimodule.core.data.Data875Repository
import com.mokelab.demo.multimodule.core.data.Data876Repository
import com.mokelab.demo.multimodule.core.data.Data877Repository
import com.mokelab.demo.multimodule.core.data.Data878Repository
import com.mokelab.demo.multimodule.core.data.Data879Repository
import com.mokelab.demo.multimodule.core.data.Data880Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen088ViewModel @Inject constructor(
    private val repo1: Data871Repository,
    private val repo2: Data872Repository,
    private val repo3: Data873Repository,
    private val repo4: Data874Repository,
    private val repo5: Data875Repository,
    private val repo6: Data876Repository,
    private val repo7: Data877Repository,
    private val repo8: Data878Repository,
    private val repo9: Data879Repository,
    private val repo10: Data880Repository,

    ) : ViewModel() {
}
