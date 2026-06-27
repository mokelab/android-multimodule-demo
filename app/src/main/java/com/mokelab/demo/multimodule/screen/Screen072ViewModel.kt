package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data711RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data712RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data713RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data714RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data715RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data716RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data717RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data718RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data719RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data720RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen072ViewModel @Inject constructor(
    private val repo1: Data711RepositoryImpl,
    private val repo2: Data712RepositoryImpl,
    private val repo3: Data713RepositoryImpl,
    private val repo4: Data714RepositoryImpl,
    private val repo5: Data715RepositoryImpl,
    private val repo6: Data716RepositoryImpl,
    private val repo7: Data717RepositoryImpl,
    private val repo8: Data718RepositoryImpl,
    private val repo9: Data719RepositoryImpl,
    private val repo10: Data720RepositoryImpl,

): ViewModel() {
}
