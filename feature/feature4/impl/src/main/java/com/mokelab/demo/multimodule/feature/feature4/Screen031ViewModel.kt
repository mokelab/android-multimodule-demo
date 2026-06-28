package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data301Repository
import com.mokelab.demo.multimodule.core.data.Data302Repository
import com.mokelab.demo.multimodule.core.data.Data303Repository
import com.mokelab.demo.multimodule.core.data.Data304Repository
import com.mokelab.demo.multimodule.core.data.Data305Repository
import com.mokelab.demo.multimodule.core.data.Data306Repository
import com.mokelab.demo.multimodule.core.data.Data307Repository
import com.mokelab.demo.multimodule.core.data.Data308Repository
import com.mokelab.demo.multimodule.core.data.Data309Repository
import com.mokelab.demo.multimodule.core.data.Data310Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen031ViewModel @Inject constructor(
    private val repo1: Data301Repository,
    private val repo2: Data302Repository,
    private val repo3: Data303Repository,
    private val repo4: Data304Repository,
    private val repo5: Data305Repository,
    private val repo6: Data306Repository,
    private val repo7: Data307Repository,
    private val repo8: Data308Repository,
    private val repo9: Data309Repository,
    private val repo10: Data310Repository,

    ) : ViewModel() {
}
