package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data841RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data842RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data843RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data844RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data845RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data846RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data847RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data848RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data849RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data850RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen085ViewModel @Inject constructor(
    private val repo1: Data841RepositoryImpl,
    private val repo2: Data842RepositoryImpl,
    private val repo3: Data843RepositoryImpl,
    private val repo4: Data844RepositoryImpl,
    private val repo5: Data845RepositoryImpl,
    private val repo6: Data846RepositoryImpl,
    private val repo7: Data847RepositoryImpl,
    private val repo8: Data848RepositoryImpl,
    private val repo9: Data849RepositoryImpl,
    private val repo10: Data850RepositoryImpl,

): ViewModel() {
}
