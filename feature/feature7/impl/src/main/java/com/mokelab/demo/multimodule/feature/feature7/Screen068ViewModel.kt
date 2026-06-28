package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data671Repository
import com.mokelab.demo.multimodule.core.data.Data672Repository
import com.mokelab.demo.multimodule.core.data.Data673Repository
import com.mokelab.demo.multimodule.core.data.Data674Repository
import com.mokelab.demo.multimodule.core.data.Data675Repository
import com.mokelab.demo.multimodule.core.data.Data676Repository
import com.mokelab.demo.multimodule.core.data.Data677Repository
import com.mokelab.demo.multimodule.core.data.Data678Repository
import com.mokelab.demo.multimodule.core.data.Data679Repository
import com.mokelab.demo.multimodule.core.data.Data680Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen068ViewModel @Inject constructor(
    private val repo1: Data671Repository,
    private val repo2: Data672Repository,
    private val repo3: Data673Repository,
    private val repo4: Data674Repository,
    private val repo5: Data675Repository,
    private val repo6: Data676Repository,
    private val repo7: Data677Repository,
    private val repo8: Data678Repository,
    private val repo9: Data679Repository,
    private val repo10: Data680Repository,

    ) : ViewModel() {
}
