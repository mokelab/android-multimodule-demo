package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data611RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data612RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data613RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data614RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data615RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data616RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data617RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data618RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data619RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data620RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen062ViewModel @Inject constructor(
    private val repo1: Data611RepositoryImpl,
    private val repo2: Data612RepositoryImpl,
    private val repo3: Data613RepositoryImpl,
    private val repo4: Data614RepositoryImpl,
    private val repo5: Data615RepositoryImpl,
    private val repo6: Data616RepositoryImpl,
    private val repo7: Data617RepositoryImpl,
    private val repo8: Data618RepositoryImpl,
    private val repo9: Data619RepositoryImpl,
    private val repo10: Data620RepositoryImpl,

): ViewModel() {
}
