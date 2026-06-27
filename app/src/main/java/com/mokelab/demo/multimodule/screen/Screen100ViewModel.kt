package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data991RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data992RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data993RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data994RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data995RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data996RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data997RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data998RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data999RepositoryImpl
import com.mokelab.demo.multimodule.repository.Data001RepositoryImpl

import javax.inject.Inject

@HiltViewModel
class Screen100ViewModel @Inject constructor(
    private val repo1: Data991RepositoryImpl,
    private val repo2: Data992RepositoryImpl,
    private val repo3: Data993RepositoryImpl,
    private val repo4: Data994RepositoryImpl,
    private val repo5: Data995RepositoryImpl,
    private val repo6: Data996RepositoryImpl,
    private val repo7: Data997RepositoryImpl,
    private val repo8: Data998RepositoryImpl,
    private val repo9: Data999RepositoryImpl,
    private val repo10: Data001RepositoryImpl,

    ): ViewModel() {
}
