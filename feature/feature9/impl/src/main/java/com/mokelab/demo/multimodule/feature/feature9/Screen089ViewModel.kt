package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data881Repository
import com.mokelab.demo.multimodule.core.data.Data882Repository
import com.mokelab.demo.multimodule.core.data.Data883Repository
import com.mokelab.demo.multimodule.core.data.Data884Repository
import com.mokelab.demo.multimodule.core.data.Data885Repository
import com.mokelab.demo.multimodule.core.data.Data886Repository
import com.mokelab.demo.multimodule.core.data.Data887Repository
import com.mokelab.demo.multimodule.core.data.Data888Repository
import com.mokelab.demo.multimodule.core.data.Data889Repository
import com.mokelab.demo.multimodule.core.data.Data890Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen089ViewModel @Inject constructor(
    private val repo1: Data881Repository,
    private val repo2: Data882Repository,
    private val repo3: Data883Repository,
    private val repo4: Data884Repository,
    private val repo5: Data885Repository,
    private val repo6: Data886Repository,
    private val repo7: Data887Repository,
    private val repo8: Data888Repository,
    private val repo9: Data889Repository,
    private val repo10: Data890Repository,

    ) : ViewModel() {
}
