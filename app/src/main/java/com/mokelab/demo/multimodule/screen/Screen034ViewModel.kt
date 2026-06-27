package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data331RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data332RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data333RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data334RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data335RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data336RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data337RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data338RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data339RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data340RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen034ViewModel @Inject constructor(
    private val repo1: Data331RepositoryImpl,
    private val repo2: Data332RepositoryImpl,
    private val repo3: Data333RepositoryImpl,
    private val repo4: Data334RepositoryImpl,
    private val repo5: Data335RepositoryImpl,
    private val repo6: Data336RepositoryImpl,
    private val repo7: Data337RepositoryImpl,
    private val repo8: Data338RepositoryImpl,
    private val repo9: Data339RepositoryImpl,
    private val repo10: Data340RepositoryImpl,

): ViewModel() {
}
