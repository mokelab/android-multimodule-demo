package com.mokelab.demo.multimodule.feature.feature4

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data341Repository 
import com.mokelab.demo.multimodule.core.data.Data342Repository 
import com.mokelab.demo.multimodule.core.data.Data343Repository 
import com.mokelab.demo.multimodule.core.data.Data344Repository 
import com.mokelab.demo.multimodule.core.data.Data345Repository 
import com.mokelab.demo.multimodule.core.data.Data346Repository 
import com.mokelab.demo.multimodule.core.data.Data347Repository 
import com.mokelab.demo.multimodule.core.data.Data348Repository 
import com.mokelab.demo.multimodule.core.data.Data349Repository 
import com.mokelab.demo.multimodule.core.data.Data350Repository 

import javax.inject.Inject

@HiltViewModel
class Screen035ViewModel @Inject constructor(
    private val repo1: Data341Repository,
    private val repo2: Data342Repository,
    private val repo3: Data343Repository,
    private val repo4: Data344Repository,
    private val repo5: Data345Repository,
    private val repo6: Data346Repository,
    private val repo7: Data347Repository,
    private val repo8: Data348Repository,
    private val repo9: Data349Repository,
    private val repo10: Data350Repository,

): ViewModel() {
}
