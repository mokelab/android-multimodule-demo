package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data651Repository
import com.mokelab.demo.multimodule.core.data.Data652Repository
import com.mokelab.demo.multimodule.core.data.Data653Repository
import com.mokelab.demo.multimodule.core.data.Data654Repository
import com.mokelab.demo.multimodule.core.data.Data655Repository
import com.mokelab.demo.multimodule.core.data.Data656Repository
import com.mokelab.demo.multimodule.core.data.Data657Repository
import com.mokelab.demo.multimodule.core.data.Data658Repository
import com.mokelab.demo.multimodule.core.data.Data659Repository
import com.mokelab.demo.multimodule.core.data.Data660Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen066ViewModel @Inject constructor(
    private val repo1: Data651Repository,
    private val repo2: Data652Repository,
    private val repo3: Data653Repository,
    private val repo4: Data654Repository,
    private val repo5: Data655Repository,
    private val repo6: Data656Repository,
    private val repo7: Data657Repository,
    private val repo8: Data658Repository,
    private val repo9: Data659Repository,
    private val repo10: Data660Repository,

    ) : ViewModel() {
}
