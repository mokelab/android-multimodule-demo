package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data661Repository
import com.mokelab.demo.multimodule.core.data.Data662Repository
import com.mokelab.demo.multimodule.core.data.Data663Repository
import com.mokelab.demo.multimodule.core.data.Data664Repository
import com.mokelab.demo.multimodule.core.data.Data665Repository
import com.mokelab.demo.multimodule.core.data.Data666Repository
import com.mokelab.demo.multimodule.core.data.Data667Repository
import com.mokelab.demo.multimodule.core.data.Data668Repository
import com.mokelab.demo.multimodule.core.data.Data669Repository
import com.mokelab.demo.multimodule.core.data.Data670Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen067ViewModel @Inject constructor(
    private val repo1: Data661Repository,
    private val repo2: Data662Repository,
    private val repo3: Data663Repository,
    private val repo4: Data664Repository,
    private val repo5: Data665Repository,
    private val repo6: Data666Repository,
    private val repo7: Data667Repository,
    private val repo8: Data668Repository,
    private val repo9: Data669Repository,
    private val repo10: Data670Repository,

    ) : ViewModel() {
}
