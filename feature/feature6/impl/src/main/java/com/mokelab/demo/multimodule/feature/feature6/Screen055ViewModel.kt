package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data541Repository
import com.mokelab.demo.multimodule.core.data.Data542Repository
import com.mokelab.demo.multimodule.core.data.Data543Repository
import com.mokelab.demo.multimodule.core.data.Data544Repository
import com.mokelab.demo.multimodule.core.data.Data545Repository
import com.mokelab.demo.multimodule.core.data.Data546Repository
import com.mokelab.demo.multimodule.core.data.Data547Repository
import com.mokelab.demo.multimodule.core.data.Data548Repository
import com.mokelab.demo.multimodule.core.data.Data549Repository
import com.mokelab.demo.multimodule.core.data.Data550Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen055ViewModel @Inject constructor(
    private val repo1: Data541Repository,
    private val repo2: Data542Repository,
    private val repo3: Data543Repository,
    private val repo4: Data544Repository,
    private val repo5: Data545Repository,
    private val repo6: Data546Repository,
    private val repo7: Data547Repository,
    private val repo8: Data548Repository,
    private val repo9: Data549Repository,
    private val repo10: Data550Repository,

    ) : ViewModel() {
}
