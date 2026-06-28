package com.mokelab.demo.multimodule.feature.feature7

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data681Repository
import com.mokelab.demo.multimodule.core.data.Data682Repository
import com.mokelab.demo.multimodule.core.data.Data683Repository
import com.mokelab.demo.multimodule.core.data.Data684Repository
import com.mokelab.demo.multimodule.core.data.Data685Repository
import com.mokelab.demo.multimodule.core.data.Data686Repository
import com.mokelab.demo.multimodule.core.data.Data687Repository
import com.mokelab.demo.multimodule.core.data.Data688Repository
import com.mokelab.demo.multimodule.core.data.Data689Repository
import com.mokelab.demo.multimodule.core.data.Data690Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen069ViewModel @Inject constructor(
    private val repo1: Data681Repository,
    private val repo2: Data682Repository,
    private val repo3: Data683Repository,
    private val repo4: Data684Repository,
    private val repo5: Data685Repository,
    private val repo6: Data686Repository,
    private val repo7: Data687Repository,
    private val repo8: Data688Repository,
    private val repo9: Data689Repository,
    private val repo10: Data690Repository,

    ) : ViewModel() {
}
