package com.mokelab.demo.multimodule.feature.feature1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.core.data.Data061Repository 
import com.mokelab.demo.multimodule.core.data.Data062Repository 
import com.mokelab.demo.multimodule.core.data.Data063Repository 
import com.mokelab.demo.multimodule.core.data.Data064Repository 
import com.mokelab.demo.multimodule.core.data.Data065Repository 
import com.mokelab.demo.multimodule.core.data.Data066Repository 
import com.mokelab.demo.multimodule.core.data.Data067Repository 
import com.mokelab.demo.multimodule.core.data.Data068Repository 
import com.mokelab.demo.multimodule.core.data.Data069Repository 
import com.mokelab.demo.multimodule.core.data.Data070Repository 

import javax.inject.Inject

@HiltViewModel
class Screen007ViewModel @Inject constructor(
    private val repo1: Data061Repository,
    private val repo2: Data062Repository,
    private val repo3: Data063Repository,
    private val repo4: Data064Repository,
    private val repo5: Data065Repository,
    private val repo6: Data066Repository,
    private val repo7: Data067Repository,
    private val repo8: Data068Repository,
    private val repo9: Data069Repository,
    private val repo10: Data070Repository,

): ViewModel() {
}
