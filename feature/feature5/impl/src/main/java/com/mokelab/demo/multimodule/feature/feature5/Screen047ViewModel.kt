package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data461Repository
import com.mokelab.demo.multimodule.core.data.Data462Repository
import com.mokelab.demo.multimodule.core.data.Data463Repository
import com.mokelab.demo.multimodule.core.data.Data464Repository
import com.mokelab.demo.multimodule.core.data.Data465Repository
import com.mokelab.demo.multimodule.core.data.Data466Repository
import com.mokelab.demo.multimodule.core.data.Data467Repository
import com.mokelab.demo.multimodule.core.data.Data468Repository
import com.mokelab.demo.multimodule.core.data.Data469Repository
import com.mokelab.demo.multimodule.core.data.Data470Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen047ViewModel @Inject constructor(
    private val repo1: Data461Repository,
    private val repo2: Data462Repository,
    private val repo3: Data463Repository,
    private val repo4: Data464Repository,
    private val repo5: Data465Repository,
    private val repo6: Data466Repository,
    private val repo7: Data467Repository,
    private val repo8: Data468Repository,
    private val repo9: Data469Repository,
    private val repo10: Data470Repository,

    ) : ViewModel() {
}
