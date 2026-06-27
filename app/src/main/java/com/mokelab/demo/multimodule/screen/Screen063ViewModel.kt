package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data621RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data622RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data623RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data624RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data625RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data626RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data627RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data628RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data629RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data630RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen063ViewModel @Inject constructor(
    private val repo1: Data621RepositoryImpl,
    private val repo2: Data622RepositoryImpl,
    private val repo3: Data623RepositoryImpl,
    private val repo4: Data624RepositoryImpl,
    private val repo5: Data625RepositoryImpl,
    private val repo6: Data626RepositoryImpl,
    private val repo7: Data627RepositoryImpl,
    private val repo8: Data628RepositoryImpl,
    private val repo9: Data629RepositoryImpl,
    private val repo10: Data630RepositoryImpl,

): ViewModel() {
}
