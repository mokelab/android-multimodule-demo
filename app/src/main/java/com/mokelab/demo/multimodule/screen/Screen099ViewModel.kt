package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data981RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data982RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data983RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data984RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data985RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data986RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data987RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data988RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data989RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data990RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen099ViewModel @Inject constructor(
    private val repo1: Data981RepositoryImpl,
    private val repo2: Data982RepositoryImpl,
    private val repo3: Data983RepositoryImpl,
    private val repo4: Data984RepositoryImpl,
    private val repo5: Data985RepositoryImpl,
    private val repo6: Data986RepositoryImpl,
    private val repo7: Data987RepositoryImpl,
    private val repo8: Data988RepositoryImpl,
    private val repo9: Data989RepositoryImpl,
    private val repo10: Data990RepositoryImpl,

): ViewModel() {
}
