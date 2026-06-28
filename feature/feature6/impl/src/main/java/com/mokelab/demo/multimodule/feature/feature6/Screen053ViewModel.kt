package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data521Repository
import com.mokelab.demo.multimodule.core.data.Data522Repository
import com.mokelab.demo.multimodule.core.data.Data523Repository
import com.mokelab.demo.multimodule.core.data.Data524Repository
import com.mokelab.demo.multimodule.core.data.Data525Repository
import com.mokelab.demo.multimodule.core.data.Data526Repository
import com.mokelab.demo.multimodule.core.data.Data527Repository
import com.mokelab.demo.multimodule.core.data.Data528Repository
import com.mokelab.demo.multimodule.core.data.Data529Repository
import com.mokelab.demo.multimodule.core.data.Data530Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen053ViewModel @Inject constructor(
    private val repo1: Data521Repository,
    private val repo2: Data522Repository,
    private val repo3: Data523Repository,
    private val repo4: Data524Repository,
    private val repo5: Data525Repository,
    private val repo6: Data526Repository,
    private val repo7: Data527Repository,
    private val repo8: Data528Repository,
    private val repo9: Data529Repository,
    private val repo10: Data530Repository,

    ) : ViewModel() {
}
