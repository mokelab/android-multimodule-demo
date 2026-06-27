package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data491RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data492RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data493RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data494RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data495RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data496RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data497RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data498RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data499RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data500RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen050ViewModel @Inject constructor(
    private val repo1: Data491RepositoryImpl,
    private val repo2: Data492RepositoryImpl,
    private val repo3: Data493RepositoryImpl,
    private val repo4: Data494RepositoryImpl,
    private val repo5: Data495RepositoryImpl,
    private val repo6: Data496RepositoryImpl,
    private val repo7: Data497RepositoryImpl,
    private val repo8: Data498RepositoryImpl,
    private val repo9: Data499RepositoryImpl,
    private val repo10: Data500RepositoryImpl,

): ViewModel() {
}
