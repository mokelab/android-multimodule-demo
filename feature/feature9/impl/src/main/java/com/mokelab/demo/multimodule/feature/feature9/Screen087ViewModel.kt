package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data861Repository
import com.mokelab.demo.multimodule.core.data.Data862Repository
import com.mokelab.demo.multimodule.core.data.Data863Repository
import com.mokelab.demo.multimodule.core.data.Data864Repository
import com.mokelab.demo.multimodule.core.data.Data865Repository
import com.mokelab.demo.multimodule.core.data.Data866Repository
import com.mokelab.demo.multimodule.core.data.Data867Repository
import com.mokelab.demo.multimodule.core.data.Data868Repository
import com.mokelab.demo.multimodule.core.data.Data869Repository
import com.mokelab.demo.multimodule.core.data.Data870Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen087ViewModel @Inject constructor(
    private val repo1: Data861Repository,
    private val repo2: Data862Repository,
    private val repo3: Data863Repository,
    private val repo4: Data864Repository,
    private val repo5: Data865Repository,
    private val repo6: Data866Repository,
    private val repo7: Data867Repository,
    private val repo8: Data868Repository,
    private val repo9: Data869Repository,
    private val repo10: Data870Repository,

    ) : ViewModel() {
}
