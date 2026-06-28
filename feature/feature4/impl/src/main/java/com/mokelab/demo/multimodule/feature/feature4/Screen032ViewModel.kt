package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data311Repository
import com.mokelab.demo.multimodule.core.data.Data312Repository
import com.mokelab.demo.multimodule.core.data.Data313Repository
import com.mokelab.demo.multimodule.core.data.Data314Repository
import com.mokelab.demo.multimodule.core.data.Data315Repository
import com.mokelab.demo.multimodule.core.data.Data316Repository
import com.mokelab.demo.multimodule.core.data.Data317Repository
import com.mokelab.demo.multimodule.core.data.Data318Repository
import com.mokelab.demo.multimodule.core.data.Data319Repository
import com.mokelab.demo.multimodule.core.data.Data320Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen032ViewModel @Inject constructor(
    private val repo1: Data311Repository,
    private val repo2: Data312Repository,
    private val repo3: Data313Repository,
    private val repo4: Data314Repository,
    private val repo5: Data315Repository,
    private val repo6: Data316Repository,
    private val repo7: Data317Repository,
    private val repo8: Data318Repository,
    private val repo9: Data319Repository,
    private val repo10: Data320Repository,

    ) : ViewModel() {
}
