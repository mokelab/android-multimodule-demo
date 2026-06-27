package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data371RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data372RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data373RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data374RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data375RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data376RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data377RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data378RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data379RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data380RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen038ViewModel @Inject constructor(
    private val repo1: Data371RepositoryImpl,
    private val repo2: Data372RepositoryImpl,
    private val repo3: Data373RepositoryImpl,
    private val repo4: Data374RepositoryImpl,
    private val repo5: Data375RepositoryImpl,
    private val repo6: Data376RepositoryImpl,
    private val repo7: Data377RepositoryImpl,
    private val repo8: Data378RepositoryImpl,
    private val repo9: Data379RepositoryImpl,
    private val repo10: Data380RepositoryImpl,

): ViewModel() {
}
