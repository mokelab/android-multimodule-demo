package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data441Repository
import com.mokelab.demo.multimodule.core.data.Data442Repository
import com.mokelab.demo.multimodule.core.data.Data443Repository
import com.mokelab.demo.multimodule.core.data.Data444Repository
import com.mokelab.demo.multimodule.core.data.Data445Repository
import com.mokelab.demo.multimodule.core.data.Data446Repository
import com.mokelab.demo.multimodule.core.data.Data447Repository
import com.mokelab.demo.multimodule.core.data.Data448Repository
import com.mokelab.demo.multimodule.core.data.Data449Repository
import com.mokelab.demo.multimodule.core.data.Data450Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen045ViewModel @Inject constructor(
    private val repo1: Data441Repository,
    private val repo2: Data442Repository,
    private val repo3: Data443Repository,
    private val repo4: Data444Repository,
    private val repo5: Data445Repository,
    private val repo6: Data446Repository,
    private val repo7: Data447Repository,
    private val repo8: Data448Repository,
    private val repo9: Data449Repository,
    private val repo10: Data450Repository,

    ) : ViewModel() {
}
