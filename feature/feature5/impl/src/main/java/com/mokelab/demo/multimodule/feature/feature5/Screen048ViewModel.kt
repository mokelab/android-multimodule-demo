package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data471Repository
import com.mokelab.demo.multimodule.core.data.Data472Repository
import com.mokelab.demo.multimodule.core.data.Data473Repository
import com.mokelab.demo.multimodule.core.data.Data474Repository
import com.mokelab.demo.multimodule.core.data.Data475Repository
import com.mokelab.demo.multimodule.core.data.Data476Repository
import com.mokelab.demo.multimodule.core.data.Data477Repository
import com.mokelab.demo.multimodule.core.data.Data478Repository
import com.mokelab.demo.multimodule.core.data.Data479Repository
import com.mokelab.demo.multimodule.core.data.Data480Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen048ViewModel @Inject constructor(
    private val repo1: Data471Repository,
    private val repo2: Data472Repository,
    private val repo3: Data473Repository,
    private val repo4: Data474Repository,
    private val repo5: Data475Repository,
    private val repo6: Data476Repository,
    private val repo7: Data477Repository,
    private val repo8: Data478Repository,
    private val repo9: Data479Repository,
    private val repo10: Data480Repository,

    ) : ViewModel() {
}
