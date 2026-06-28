package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data551Repository
import com.mokelab.demo.multimodule.core.data.Data552Repository
import com.mokelab.demo.multimodule.core.data.Data553Repository
import com.mokelab.demo.multimodule.core.data.Data554Repository
import com.mokelab.demo.multimodule.core.data.Data555Repository
import com.mokelab.demo.multimodule.core.data.Data556Repository
import com.mokelab.demo.multimodule.core.data.Data557Repository
import com.mokelab.demo.multimodule.core.data.Data558Repository
import com.mokelab.demo.multimodule.core.data.Data559Repository
import com.mokelab.demo.multimodule.core.data.Data560Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen056ViewModel @Inject constructor(
    private val repo1: Data551Repository,
    private val repo2: Data552Repository,
    private val repo3: Data553Repository,
    private val repo4: Data554Repository,
    private val repo5: Data555Repository,
    private val repo6: Data556Repository,
    private val repo7: Data557Repository,
    private val repo8: Data558Repository,
    private val repo9: Data559Repository,
    private val repo10: Data560Repository,

    ) : ViewModel() {
}
