package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data501RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data502RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data503RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data504RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data505RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data506RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data507RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data508RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data509RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data510RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen051ViewModel @Inject constructor(
    private val repo1: Data501RepositoryImpl,
    private val repo2: Data502RepositoryImpl,
    private val repo3: Data503RepositoryImpl,
    private val repo4: Data504RepositoryImpl,
    private val repo5: Data505RepositoryImpl,
    private val repo6: Data506RepositoryImpl,
    private val repo7: Data507RepositoryImpl,
    private val repo8: Data508RepositoryImpl,
    private val repo9: Data509RepositoryImpl,
    private val repo10: Data510RepositoryImpl,

): ViewModel() {
}
