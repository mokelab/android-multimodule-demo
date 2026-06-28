package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data431Repository
import com.mokelab.demo.multimodule.core.data.Data432Repository
import com.mokelab.demo.multimodule.core.data.Data433Repository
import com.mokelab.demo.multimodule.core.data.Data434Repository
import com.mokelab.demo.multimodule.core.data.Data435Repository
import com.mokelab.demo.multimodule.core.data.Data436Repository
import com.mokelab.demo.multimodule.core.data.Data437Repository
import com.mokelab.demo.multimodule.core.data.Data438Repository
import com.mokelab.demo.multimodule.core.data.Data439Repository
import com.mokelab.demo.multimodule.core.data.Data440Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen044ViewModel @Inject constructor(
    private val repo1: Data431Repository,
    private val repo2: Data432Repository,
    private val repo3: Data433Repository,
    private val repo4: Data434Repository,
    private val repo5: Data435Repository,
    private val repo6: Data436Repository,
    private val repo7: Data437Repository,
    private val repo8: Data438Repository,
    private val repo9: Data439Repository,
    private val repo10: Data440Repository,

    ) : ViewModel() {
}
