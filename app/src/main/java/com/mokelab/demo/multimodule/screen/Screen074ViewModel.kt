package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data731RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data732RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data733RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data734RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data735RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data736RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data737RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data738RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data739RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data740RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen074ViewModel @Inject constructor(
    private val repo1: Data731RepositoryImpl,
    private val repo2: Data732RepositoryImpl,
    private val repo3: Data733RepositoryImpl,
    private val repo4: Data734RepositoryImpl,
    private val repo5: Data735RepositoryImpl,
    private val repo6: Data736RepositoryImpl,
    private val repo7: Data737RepositoryImpl,
    private val repo8: Data738RepositoryImpl,
    private val repo9: Data739RepositoryImpl,
    private val repo10: Data740RepositoryImpl,

): ViewModel() {
}
