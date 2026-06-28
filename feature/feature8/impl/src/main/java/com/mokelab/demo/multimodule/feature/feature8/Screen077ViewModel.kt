package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data761Repository
import com.mokelab.demo.multimodule.core.data.Data762Repository
import com.mokelab.demo.multimodule.core.data.Data763Repository
import com.mokelab.demo.multimodule.core.data.Data764Repository
import com.mokelab.demo.multimodule.core.data.Data765Repository
import com.mokelab.demo.multimodule.core.data.Data766Repository
import com.mokelab.demo.multimodule.core.data.Data767Repository
import com.mokelab.demo.multimodule.core.data.Data768Repository
import com.mokelab.demo.multimodule.core.data.Data769Repository
import com.mokelab.demo.multimodule.core.data.Data770Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen077ViewModel @Inject constructor(
    private val repo1: Data761Repository,
    private val repo2: Data762Repository,
    private val repo3: Data763Repository,
    private val repo4: Data764Repository,
    private val repo5: Data765Repository,
    private val repo6: Data766Repository,
    private val repo7: Data767Repository,
    private val repo8: Data768Repository,
    private val repo9: Data769Repository,
    private val repo10: Data770Repository,

    ) : ViewModel() {
}
