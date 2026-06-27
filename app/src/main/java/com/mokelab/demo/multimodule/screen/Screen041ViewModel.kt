package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data401RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data402RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data403RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data404RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data405RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data406RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data407RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data408RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data409RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data410RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen041ViewModel @Inject constructor(
    private val repo1: Data401RepositoryImpl,
    private val repo2: Data402RepositoryImpl,
    private val repo3: Data403RepositoryImpl,
    private val repo4: Data404RepositoryImpl,
    private val repo5: Data405RepositoryImpl,
    private val repo6: Data406RepositoryImpl,
    private val repo7: Data407RepositoryImpl,
    private val repo8: Data408RepositoryImpl,
    private val repo9: Data409RepositoryImpl,
    private val repo10: Data410RepositoryImpl,

): ViewModel() {
}
