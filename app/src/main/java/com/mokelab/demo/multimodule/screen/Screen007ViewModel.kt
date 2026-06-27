package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data061RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data062RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data063RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data064RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data065RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data066RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data067RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data068RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data069RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data070RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen007ViewModel @Inject constructor(
    private val repo1: Data061RepositoryImpl,
    private val repo2: Data062RepositoryImpl,
    private val repo3: Data063RepositoryImpl,
    private val repo4: Data064RepositoryImpl,
    private val repo5: Data065RepositoryImpl,
    private val repo6: Data066RepositoryImpl,
    private val repo7: Data067RepositoryImpl,
    private val repo8: Data068RepositoryImpl,
    private val repo9: Data069RepositoryImpl,
    private val repo10: Data070RepositoryImpl,

): ViewModel() {
}
