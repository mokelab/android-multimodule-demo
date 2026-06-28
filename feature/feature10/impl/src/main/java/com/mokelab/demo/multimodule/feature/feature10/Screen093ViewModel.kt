package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data921Repository
import com.mokelab.demo.multimodule.core.data.Data922Repository
import com.mokelab.demo.multimodule.core.data.Data923Repository
import com.mokelab.demo.multimodule.core.data.Data924Repository
import com.mokelab.demo.multimodule.core.data.Data925Repository
import com.mokelab.demo.multimodule.core.data.Data926Repository
import com.mokelab.demo.multimodule.core.data.Data927Repository
import com.mokelab.demo.multimodule.core.data.Data928Repository
import com.mokelab.demo.multimodule.core.data.Data929Repository
import com.mokelab.demo.multimodule.core.data.Data930Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen093ViewModel @Inject constructor(
    private val repo1: Data921Repository,
    private val repo2: Data922Repository,
    private val repo3: Data923Repository,
    private val repo4: Data924Repository,
    private val repo5: Data925Repository,
    private val repo6: Data926Repository,
    private val repo7: Data927Repository,
    private val repo8: Data928Repository,
    private val repo9: Data929Repository,
    private val repo10: Data930Repository,

    ) : ViewModel() {
}
