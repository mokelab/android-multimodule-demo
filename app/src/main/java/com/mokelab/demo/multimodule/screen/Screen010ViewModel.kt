package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data091RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data092RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data093RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data094RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data095RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data096RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data097RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data098RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data099RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data100RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen010ViewModel @Inject constructor(
    private val repo1: Data091RepositoryImpl,
    private val repo2: Data092RepositoryImpl,
    private val repo3: Data093RepositoryImpl,
    private val repo4: Data094RepositoryImpl,
    private val repo5: Data095RepositoryImpl,
    private val repo6: Data096RepositoryImpl,
    private val repo7: Data097RepositoryImpl,
    private val repo8: Data098RepositoryImpl,
    private val repo9: Data099RepositoryImpl,
    private val repo10: Data100RepositoryImpl,

): ViewModel() {
}
