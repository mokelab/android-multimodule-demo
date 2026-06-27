package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data391RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data392RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data393RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data394RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data395RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data396RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data397RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data398RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data399RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data400RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen040ViewModel @Inject constructor(
    private val repo1: Data391RepositoryImpl,
    private val repo2: Data392RepositoryImpl,
    private val repo3: Data393RepositoryImpl,
    private val repo4: Data394RepositoryImpl,
    private val repo5: Data395RepositoryImpl,
    private val repo6: Data396RepositoryImpl,
    private val repo7: Data397RepositoryImpl,
    private val repo8: Data398RepositoryImpl,
    private val repo9: Data399RepositoryImpl,
    private val repo10: Data400RepositoryImpl,

): ViewModel() {
}
