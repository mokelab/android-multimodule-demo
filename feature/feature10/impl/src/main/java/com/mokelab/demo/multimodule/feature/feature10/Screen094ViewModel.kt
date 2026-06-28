package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data931Repository
import com.mokelab.demo.multimodule.core.data.Data932Repository
import com.mokelab.demo.multimodule.core.data.Data933Repository
import com.mokelab.demo.multimodule.core.data.Data934Repository
import com.mokelab.demo.multimodule.core.data.Data935Repository
import com.mokelab.demo.multimodule.core.data.Data936Repository
import com.mokelab.demo.multimodule.core.data.Data937Repository
import com.mokelab.demo.multimodule.core.data.Data938Repository
import com.mokelab.demo.multimodule.core.data.Data939Repository
import com.mokelab.demo.multimodule.core.data.Data940Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen094ViewModel @Inject constructor(
    private val repo1: Data931Repository,
    private val repo2: Data932Repository,
    private val repo3: Data933Repository,
    private val repo4: Data934Repository,
    private val repo5: Data935Repository,
    private val repo6: Data936Repository,
    private val repo7: Data937Repository,
    private val repo8: Data938Repository,
    private val repo9: Data939Repository,
    private val repo10: Data940Repository,

    ) : ViewModel() {
}
