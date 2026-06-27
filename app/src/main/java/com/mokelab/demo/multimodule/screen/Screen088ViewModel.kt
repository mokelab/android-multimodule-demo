package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data871RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data872RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data873RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data874RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data875RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data876RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data877RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data878RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data879RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data880RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen088ViewModel @Inject constructor(
    private val repo1: Data871RepositoryImpl,
    private val repo2: Data872RepositoryImpl,
    private val repo3: Data873RepositoryImpl,
    private val repo4: Data874RepositoryImpl,
    private val repo5: Data875RepositoryImpl,
    private val repo6: Data876RepositoryImpl,
    private val repo7: Data877RepositoryImpl,
    private val repo8: Data878RepositoryImpl,
    private val repo9: Data879RepositoryImpl,
    private val repo10: Data880RepositoryImpl,

): ViewModel() {
}
