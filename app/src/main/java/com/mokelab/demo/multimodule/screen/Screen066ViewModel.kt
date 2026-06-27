package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data651RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data652RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data653RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data654RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data655RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data656RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data657RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data658RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data659RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data660RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen066ViewModel @Inject constructor(
    private val repo1: Data651RepositoryImpl,
    private val repo2: Data652RepositoryImpl,
    private val repo3: Data653RepositoryImpl,
    private val repo4: Data654RepositoryImpl,
    private val repo5: Data655RepositoryImpl,
    private val repo6: Data656RepositoryImpl,
    private val repo7: Data657RepositoryImpl,
    private val repo8: Data658RepositoryImpl,
    private val repo9: Data659RepositoryImpl,
    private val repo10: Data660RepositoryImpl,

): ViewModel() {
}
