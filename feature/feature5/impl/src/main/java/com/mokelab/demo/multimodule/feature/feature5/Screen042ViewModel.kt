package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data411Repository
import com.mokelab.demo.multimodule.core.data.Data412Repository
import com.mokelab.demo.multimodule.core.data.Data413Repository
import com.mokelab.demo.multimodule.core.data.Data414Repository
import com.mokelab.demo.multimodule.core.data.Data415Repository
import com.mokelab.demo.multimodule.core.data.Data416Repository
import com.mokelab.demo.multimodule.core.data.Data417Repository
import com.mokelab.demo.multimodule.core.data.Data418Repository
import com.mokelab.demo.multimodule.core.data.Data419Repository
import com.mokelab.demo.multimodule.core.data.Data420Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen042ViewModel @Inject constructor(
    private val repo1: Data411Repository,
    private val repo2: Data412Repository,
    private val repo3: Data413Repository,
    private val repo4: Data414Repository,
    private val repo5: Data415Repository,
    private val repo6: Data416Repository,
    private val repo7: Data417Repository,
    private val repo8: Data418Repository,
    private val repo9: Data419Repository,
    private val repo10: Data420Repository,

    ) : ViewModel() {
}
