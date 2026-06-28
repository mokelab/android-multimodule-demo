package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data691Repository
import com.mokelab.demo.multimodule.core.data.Data692Repository
import com.mokelab.demo.multimodule.core.data.Data693Repository
import com.mokelab.demo.multimodule.core.data.Data694Repository
import com.mokelab.demo.multimodule.core.data.Data695Repository
import com.mokelab.demo.multimodule.core.data.Data696Repository
import com.mokelab.demo.multimodule.core.data.Data697Repository
import com.mokelab.demo.multimodule.core.data.Data698Repository
import com.mokelab.demo.multimodule.core.data.Data699Repository
import com.mokelab.demo.multimodule.core.data.Data700Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen070ViewModel @Inject constructor(
    private val repo1: Data691Repository,
    private val repo2: Data692Repository,
    private val repo3: Data693Repository,
    private val repo4: Data694Repository,
    private val repo5: Data695Repository,
    private val repo6: Data696Repository,
    private val repo7: Data697Repository,
    private val repo8: Data698Repository,
    private val repo9: Data699Repository,
    private val repo10: Data700Repository,

    ) : ViewModel() {
}
