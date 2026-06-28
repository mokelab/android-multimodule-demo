package com.mokelab.demo.multimodule.feature.feature10

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data941Repository
import com.mokelab.demo.multimodule.core.data.Data942Repository
import com.mokelab.demo.multimodule.core.data.Data943Repository
import com.mokelab.demo.multimodule.core.data.Data944Repository
import com.mokelab.demo.multimodule.core.data.Data945Repository
import com.mokelab.demo.multimodule.core.data.Data946Repository
import com.mokelab.demo.multimodule.core.data.Data947Repository
import com.mokelab.demo.multimodule.core.data.Data948Repository
import com.mokelab.demo.multimodule.core.data.Data949Repository
import com.mokelab.demo.multimodule.core.data.Data950Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen095ViewModel @Inject constructor(
    private val repo1: Data941Repository,
    private val repo2: Data942Repository,
    private val repo3: Data943Repository,
    private val repo4: Data944Repository,
    private val repo5: Data945Repository,
    private val repo6: Data946Repository,
    private val repo7: Data947Repository,
    private val repo8: Data948Repository,
    private val repo9: Data949Repository,
    private val repo10: Data950Repository,

    ) : ViewModel() {
}
