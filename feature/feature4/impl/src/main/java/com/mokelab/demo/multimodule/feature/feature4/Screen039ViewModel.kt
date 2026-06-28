package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data381Repository 
import com.mokelab.demo.multimodule.core.data.Data382Repository 
import com.mokelab.demo.multimodule.core.data.Data383Repository 
import com.mokelab.demo.multimodule.core.data.Data384Repository 
import com.mokelab.demo.multimodule.core.data.Data385Repository 
import com.mokelab.demo.multimodule.core.data.Data386Repository 
import com.mokelab.demo.multimodule.core.data.Data387Repository 
import com.mokelab.demo.multimodule.core.data.Data388Repository 
import com.mokelab.demo.multimodule.core.data.Data389Repository 
import com.mokelab.demo.multimodule.core.data.Data390Repository 

import javax.inject.Inject

@HiltViewModel
class Screen039ViewModel @Inject constructor(
    private val repo1: Data381Repository,
    private val repo2: Data382Repository,
    private val repo3: Data383Repository,
    private val repo4: Data384Repository,
    private val repo5: Data385Repository,
    private val repo6: Data386Repository,
    private val repo7: Data387Repository,
    private val repo8: Data388Repository,
    private val repo9: Data389Repository,
    private val repo10: Data390Repository,

): ViewModel() {
}
