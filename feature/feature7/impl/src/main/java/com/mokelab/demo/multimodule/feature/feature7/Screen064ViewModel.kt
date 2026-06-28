package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data631Repository
import com.mokelab.demo.multimodule.core.data.Data632Repository
import com.mokelab.demo.multimodule.core.data.Data633Repository
import com.mokelab.demo.multimodule.core.data.Data634Repository
import com.mokelab.demo.multimodule.core.data.Data635Repository
import com.mokelab.demo.multimodule.core.data.Data636Repository
import com.mokelab.demo.multimodule.core.data.Data637Repository
import com.mokelab.demo.multimodule.core.data.Data638Repository
import com.mokelab.demo.multimodule.core.data.Data639Repository
import com.mokelab.demo.multimodule.core.data.Data640Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen064ViewModel @Inject constructor(
    private val repo1: Data631Repository,
    private val repo2: Data632Repository,
    private val repo3: Data633Repository,
    private val repo4: Data634Repository,
    private val repo5: Data635Repository,
    private val repo6: Data636Repository,
    private val repo7: Data637Repository,
    private val repo8: Data638Repository,
    private val repo9: Data639Repository,
    private val repo10: Data640Repository,

    ) : ViewModel() {
}
