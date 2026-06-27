package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data581RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data582RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data583RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data584RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data585RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data586RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data587RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data588RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data589RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data590RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen059ViewModel @Inject constructor(
    private val repo1: Data581RepositoryImpl,
    private val repo2: Data582RepositoryImpl,
    private val repo3: Data583RepositoryImpl,
    private val repo4: Data584RepositoryImpl,
    private val repo5: Data585RepositoryImpl,
    private val repo6: Data586RepositoryImpl,
    private val repo7: Data587RepositoryImpl,
    private val repo8: Data588RepositoryImpl,
    private val repo9: Data589RepositoryImpl,
    private val repo10: Data590RepositoryImpl,

): ViewModel() {
}
