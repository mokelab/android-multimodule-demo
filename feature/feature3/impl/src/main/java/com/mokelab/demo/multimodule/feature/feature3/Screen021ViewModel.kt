package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data201Repository
import com.mokelab.demo.multimodule.core.data.Data202Repository
import com.mokelab.demo.multimodule.core.data.Data203Repository
import com.mokelab.demo.multimodule.core.data.Data204Repository
import com.mokelab.demo.multimodule.core.data.Data205Repository
import com.mokelab.demo.multimodule.core.data.Data206Repository
import com.mokelab.demo.multimodule.core.data.Data207Repository
import com.mokelab.demo.multimodule.core.data.Data208Repository
import com.mokelab.demo.multimodule.core.data.Data209Repository
import com.mokelab.demo.multimodule.core.data.Data210Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen021ViewModel @Inject constructor(
    private val repo1: Data201Repository,
    private val repo2: Data202Repository,
    private val repo3: Data203Repository,
    private val repo4: Data204Repository,
    private val repo5: Data205Repository,
    private val repo6: Data206Repository,
    private val repo7: Data207Repository,
    private val repo8: Data208Repository,
    private val repo9: Data209Repository,
    private val repo10: Data210Repository,

    ) : ViewModel() {
}
