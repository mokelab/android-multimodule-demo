package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data861RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data862RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data863RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data864RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data865RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data866RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data867RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data868RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data869RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data870RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen087ViewModel @Inject constructor(
    private val repo1: Data861RepositoryImpl,
    private val repo2: Data862RepositoryImpl,
    private val repo3: Data863RepositoryImpl,
    private val repo4: Data864RepositoryImpl,
    private val repo5: Data865RepositoryImpl,
    private val repo6: Data866RepositoryImpl,
    private val repo7: Data867RepositoryImpl,
    private val repo8: Data868RepositoryImpl,
    private val repo9: Data869RepositoryImpl,
    private val repo10: Data870RepositoryImpl,

): ViewModel() {
}
