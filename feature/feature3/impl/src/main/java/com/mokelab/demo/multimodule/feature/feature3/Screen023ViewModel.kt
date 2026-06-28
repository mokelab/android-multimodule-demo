package com.mokelab.demo.multimodule.feature.feature3

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data221Repository
import com.mokelab.demo.multimodule.core.data.Data222Repository
import com.mokelab.demo.multimodule.core.data.Data223Repository
import com.mokelab.demo.multimodule.core.data.Data224Repository
import com.mokelab.demo.multimodule.core.data.Data225Repository
import com.mokelab.demo.multimodule.core.data.Data226Repository
import com.mokelab.demo.multimodule.core.data.Data227Repository
import com.mokelab.demo.multimodule.core.data.Data228Repository
import com.mokelab.demo.multimodule.core.data.Data229Repository
import com.mokelab.demo.multimodule.core.data.Data230Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen023ViewModel @Inject constructor(
    private val repo1: Data221Repository,
    private val repo2: Data222Repository,
    private val repo3: Data223Repository,
    private val repo4: Data224Repository,
    private val repo5: Data225Repository,
    private val repo6: Data226Repository,
    private val repo7: Data227Repository,
    private val repo8: Data228Repository,
    private val repo9: Data229Repository,
    private val repo10: Data230Repository,

    ) : ViewModel() {
}
