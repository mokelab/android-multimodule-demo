package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data251RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data252RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data253RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data254RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data255RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data256RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data257RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data258RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data259RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data260RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen026ViewModel @Inject constructor(
    private val repo1: Data251RepositoryImpl,
    private val repo2: Data252RepositoryImpl,
    private val repo3: Data253RepositoryImpl,
    private val repo4: Data254RepositoryImpl,
    private val repo5: Data255RepositoryImpl,
    private val repo6: Data256RepositoryImpl,
    private val repo7: Data257RepositoryImpl,
    private val repo8: Data258RepositoryImpl,
    private val repo9: Data259RepositoryImpl,
    private val repo10: Data260RepositoryImpl,

): ViewModel() {
}
