package com.mokelab.demo.multimodule.feature.feature8

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data771Repository
import com.mokelab.demo.multimodule.core.data.Data772Repository
import com.mokelab.demo.multimodule.core.data.Data773Repository
import com.mokelab.demo.multimodule.core.data.Data774Repository
import com.mokelab.demo.multimodule.core.data.Data775Repository
import com.mokelab.demo.multimodule.core.data.Data776Repository
import com.mokelab.demo.multimodule.core.data.Data777Repository
import com.mokelab.demo.multimodule.core.data.Data778Repository
import com.mokelab.demo.multimodule.core.data.Data779Repository
import com.mokelab.demo.multimodule.core.data.Data780Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen078ViewModel @Inject constructor(
    private val repo1: Data771Repository,
    private val repo2: Data772Repository,
    private val repo3: Data773Repository,
    private val repo4: Data774Repository,
    private val repo5: Data775Repository,
    private val repo6: Data776Repository,
    private val repo7: Data777Repository,
    private val repo8: Data778Repository,
    private val repo9: Data779Repository,
    private val repo10: Data780Repository,

    ) : ViewModel() {
}
