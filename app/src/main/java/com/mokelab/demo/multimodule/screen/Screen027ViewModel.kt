package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data261RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data262RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data263RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data264RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data265RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data266RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data267RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data268RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data269RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data270RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen027ViewModel @Inject constructor(
    private val repo1: Data261RepositoryImpl,
    private val repo2: Data262RepositoryImpl,
    private val repo3: Data263RepositoryImpl,
    private val repo4: Data264RepositoryImpl,
    private val repo5: Data265RepositoryImpl,
    private val repo6: Data266RepositoryImpl,
    private val repo7: Data267RepositoryImpl,
    private val repo8: Data268RepositoryImpl,
    private val repo9: Data269RepositoryImpl,
    private val repo10: Data270RepositoryImpl,

): ViewModel() {
}
