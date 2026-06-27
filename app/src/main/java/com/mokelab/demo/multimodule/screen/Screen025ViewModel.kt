package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data241RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data242RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data243RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data244RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data245RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data246RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data247RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data248RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data249RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data250RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen025ViewModel @Inject constructor(
    private val repo1: Data241RepositoryImpl,
    private val repo2: Data242RepositoryImpl,
    private val repo3: Data243RepositoryImpl,
    private val repo4: Data244RepositoryImpl,
    private val repo5: Data245RepositoryImpl,
    private val repo6: Data246RepositoryImpl,
    private val repo7: Data247RepositoryImpl,
    private val repo8: Data248RepositoryImpl,
    private val repo9: Data249RepositoryImpl,
    private val repo10: Data250RepositoryImpl,

): ViewModel() {
}
