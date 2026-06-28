package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data421Repository
import com.mokelab.demo.multimodule.core.data.Data422Repository
import com.mokelab.demo.multimodule.core.data.Data423Repository
import com.mokelab.demo.multimodule.core.data.Data424Repository
import com.mokelab.demo.multimodule.core.data.Data425Repository
import com.mokelab.demo.multimodule.core.data.Data426Repository
import com.mokelab.demo.multimodule.core.data.Data427Repository
import com.mokelab.demo.multimodule.core.data.Data428Repository
import com.mokelab.demo.multimodule.core.data.Data429Repository
import com.mokelab.demo.multimodule.core.data.Data430Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen043ViewModel @Inject constructor(
    private val repo1: Data421Repository,
    private val repo2: Data422Repository,
    private val repo3: Data423Repository,
    private val repo4: Data424Repository,
    private val repo5: Data425Repository,
    private val repo6: Data426Repository,
    private val repo7: Data427Repository,
    private val repo8: Data428Repository,
    private val repo9: Data429Repository,
    private val repo10: Data430Repository,

    ) : ViewModel() {
}
