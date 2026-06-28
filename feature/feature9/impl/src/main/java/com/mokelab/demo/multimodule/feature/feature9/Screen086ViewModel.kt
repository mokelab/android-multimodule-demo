package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data851Repository
import com.mokelab.demo.multimodule.core.data.Data852Repository
import com.mokelab.demo.multimodule.core.data.Data853Repository
import com.mokelab.demo.multimodule.core.data.Data854Repository
import com.mokelab.demo.multimodule.core.data.Data855Repository
import com.mokelab.demo.multimodule.core.data.Data856Repository
import com.mokelab.demo.multimodule.core.data.Data857Repository
import com.mokelab.demo.multimodule.core.data.Data858Repository
import com.mokelab.demo.multimodule.core.data.Data859Repository
import com.mokelab.demo.multimodule.core.data.Data860Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen086ViewModel @Inject constructor(
    private val repo1: Data851Repository,
    private val repo2: Data852Repository,
    private val repo3: Data853Repository,
    private val repo4: Data854Repository,
    private val repo5: Data855Repository,
    private val repo6: Data856Repository,
    private val repo7: Data857Repository,
    private val repo8: Data858Repository,
    private val repo9: Data859Repository,
    private val repo10: Data860Repository,

    ) : ViewModel() {
}
