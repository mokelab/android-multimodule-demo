package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data571Repository
import com.mokelab.demo.multimodule.core.data.Data572Repository
import com.mokelab.demo.multimodule.core.data.Data573Repository
import com.mokelab.demo.multimodule.core.data.Data574Repository
import com.mokelab.demo.multimodule.core.data.Data575Repository
import com.mokelab.demo.multimodule.core.data.Data576Repository
import com.mokelab.demo.multimodule.core.data.Data577Repository
import com.mokelab.demo.multimodule.core.data.Data578Repository
import com.mokelab.demo.multimodule.core.data.Data579Repository
import com.mokelab.demo.multimodule.core.data.Data580Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen058ViewModel @Inject constructor(
    private val repo1: Data571Repository,
    private val repo2: Data572Repository,
    private val repo3: Data573Repository,
    private val repo4: Data574Repository,
    private val repo5: Data575Repository,
    private val repo6: Data576Repository,
    private val repo7: Data577Repository,
    private val repo8: Data578Repository,
    private val repo9: Data579Repository,
    private val repo10: Data580Repository,

    ) : ViewModel() {
}
