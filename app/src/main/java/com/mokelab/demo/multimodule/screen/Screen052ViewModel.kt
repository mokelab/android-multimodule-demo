package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data511RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data512RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data513RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data514RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data515RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data516RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data517RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data518RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data519RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data520RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen052ViewModel @Inject constructor(
    private val repo1: Data511RepositoryImpl,
    private val repo2: Data512RepositoryImpl,
    private val repo3: Data513RepositoryImpl,
    private val repo4: Data514RepositoryImpl,
    private val repo5: Data515RepositoryImpl,
    private val repo6: Data516RepositoryImpl,
    private val repo7: Data517RepositoryImpl,
    private val repo8: Data518RepositoryImpl,
    private val repo9: Data519RepositoryImpl,
    private val repo10: Data520RepositoryImpl,

): ViewModel() {
}
