package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data951Repository
import com.mokelab.demo.multimodule.core.data.Data952Repository
import com.mokelab.demo.multimodule.core.data.Data953Repository
import com.mokelab.demo.multimodule.core.data.Data954Repository
import com.mokelab.demo.multimodule.core.data.Data955Repository
import com.mokelab.demo.multimodule.core.data.Data956Repository
import com.mokelab.demo.multimodule.core.data.Data957Repository
import com.mokelab.demo.multimodule.core.data.Data958Repository
import com.mokelab.demo.multimodule.core.data.Data959Repository
import com.mokelab.demo.multimodule.core.data.Data960Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen096ViewModel @Inject constructor(
    private val repo1: Data951Repository,
    private val repo2: Data952Repository,
    private val repo3: Data953Repository,
    private val repo4: Data954Repository,
    private val repo5: Data955Repository,
    private val repo6: Data956Repository,
    private val repo7: Data957Repository,
    private val repo8: Data958Repository,
    private val repo9: Data959Repository,
    private val repo10: Data960Repository,

    ) : ViewModel() {
}
