package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data891RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data892RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data893RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data894RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data895RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data896RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data897RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data898RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data899RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data900RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen090ViewModel @Inject constructor(
    private val repo1: Data891RepositoryImpl,
    private val repo2: Data892RepositoryImpl,
    private val repo3: Data893RepositoryImpl,
    private val repo4: Data894RepositoryImpl,
    private val repo5: Data895RepositoryImpl,
    private val repo6: Data896RepositoryImpl,
    private val repo7: Data897RepositoryImpl,
    private val repo8: Data898RepositoryImpl,
    private val repo9: Data899RepositoryImpl,
    private val repo10: Data900RepositoryImpl,

): ViewModel() {
}
