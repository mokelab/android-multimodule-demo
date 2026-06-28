package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data901Repository
import com.mokelab.demo.multimodule.core.data.Data902Repository
import com.mokelab.demo.multimodule.core.data.Data903Repository
import com.mokelab.demo.multimodule.core.data.Data904Repository
import com.mokelab.demo.multimodule.core.data.Data905Repository
import com.mokelab.demo.multimodule.core.data.Data906Repository
import com.mokelab.demo.multimodule.core.data.Data907Repository
import com.mokelab.demo.multimodule.core.data.Data908Repository
import com.mokelab.demo.multimodule.core.data.Data909Repository
import com.mokelab.demo.multimodule.core.data.Data910Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen091ViewModel @Inject constructor(
    private val repo1: Data901Repository,
    private val repo2: Data902Repository,
    private val repo3: Data903Repository,
    private val repo4: Data904Repository,
    private val repo5: Data905Repository,
    private val repo6: Data906Repository,
    private val repo7: Data907Repository,
    private val repo8: Data908Repository,
    private val repo9: Data909Repository,
    private val repo10: Data910Repository,

    ) : ViewModel() {
}
