package com.mokelab.demo.multimodule.feature.feature9

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data831Repository
import com.mokelab.demo.multimodule.core.data.Data832Repository
import com.mokelab.demo.multimodule.core.data.Data833Repository
import com.mokelab.demo.multimodule.core.data.Data834Repository
import com.mokelab.demo.multimodule.core.data.Data835Repository
import com.mokelab.demo.multimodule.core.data.Data836Repository
import com.mokelab.demo.multimodule.core.data.Data837Repository
import com.mokelab.demo.multimodule.core.data.Data838Repository
import com.mokelab.demo.multimodule.core.data.Data839Repository
import com.mokelab.demo.multimodule.core.data.Data840Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen084ViewModel @Inject constructor(
    private val repo1: Data831Repository,
    private val repo2: Data832Repository,
    private val repo3: Data833Repository,
    private val repo4: Data834Repository,
    private val repo5: Data835Repository,
    private val repo6: Data836Repository,
    private val repo7: Data837Repository,
    private val repo8: Data838Repository,
    private val repo9: Data839Repository,
    private val repo10: Data840Repository,

    ) : ViewModel() {
}
