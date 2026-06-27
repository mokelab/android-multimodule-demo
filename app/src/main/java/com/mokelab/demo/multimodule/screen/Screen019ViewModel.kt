package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data181RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data182RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data183RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data184RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data185RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data186RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data187RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data188RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data189RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data190RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen019ViewModel @Inject constructor(
    private val repo1: Data181RepositoryImpl,
    private val repo2: Data182RepositoryImpl,
    private val repo3: Data183RepositoryImpl,
    private val repo4: Data184RepositoryImpl,
    private val repo5: Data185RepositoryImpl,
    private val repo6: Data186RepositoryImpl,
    private val repo7: Data187RepositoryImpl,
    private val repo8: Data188RepositoryImpl,
    private val repo9: Data189RepositoryImpl,
    private val repo10: Data190RepositoryImpl,

): ViewModel() {
}
